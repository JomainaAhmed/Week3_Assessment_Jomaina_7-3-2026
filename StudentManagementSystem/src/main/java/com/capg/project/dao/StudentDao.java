package com.capg.project.dao;

import com.capg.project.entity.Student;
import com.capg.project.entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDao {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("dev");

    // SAVE
    public Student saveStudent(Student s) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(s);
        et.commit();

        em.close();
        return s;
    }

    //FIND BY ID
    public Student findStudentById(int id) {

        EntityManager em = emf.createEntityManager();

        Student student = em.find(Student.class, id);

        em.close();
        return student;
    }

    // UPDATE
    public void updateStudentMarks(int id, double newMarks) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        Student student = em.find(Student.class, id);

        if (student != null) {
            student.setMarks(newMarks);
        } else {
            System.out.println("Student not found");
        }

        et.commit();
        em.close();
    }

    // DELETE
    public void deleteStudentById(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        Student student = em.find(Student.class, id);

        if (student != null) {
            em.remove(student);
        } else {
            System.out.println("Student not found");
        }

        et.commit();
        em.close();
    }
    
    // GIVE COURSE TO STUDENT 
    public void giveCourseToStudent(int studentId, int courseId) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        Student student = em.find(Student.class, studentId);
        Course course = em.find(Course.class, courseId);

        if (student != null && course != null) {
            student.getCourses().add(course);
        } else {
            System.out.println("Student or Course not found");
        }

        et.commit();
        em.close();
    }

}
