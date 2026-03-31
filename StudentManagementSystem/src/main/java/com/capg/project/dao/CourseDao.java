package com.capg.project.dao;

import com.capg.project.entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CourseDao {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("dev");

    // SAVE
    public Course saveCourse(Course c) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(c);
        et.commit();

        em.close();
        return c;
    }

    // FIND BY ID
    public Course findCourseById(int id) {

        EntityManager em = emf.createEntityManager();

        Course course = em.find(Course.class, id);

        em.close();
        return course;
    }

    // UPDATE
    public void updateCourseTrainer(int id, String newTrainer) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        Course course = em.find(Course.class, id);

        if (course != null) {
            course.setTrainer(newTrainer);
        } else {
            System.out.println("Course not found");
        }

        et.commit();
        em.close();
    }

    // DELETE
    public void deleteCourseById(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        Course course = em.find(Course.class, id);

        if (course != null) {
            em.remove(course);
        } else {
            System.out.println("Course not found");
        }

        et.commit();
        em.close();
    }
}