package com.capg.project.service;

import com.capg.project.entity.Student;
import com.capg.project.dao.*;

public class StudentService {
	
	private StudentDao dao = new StudentDao();
	
	public Student registerStudent(String name, int age, double marks) {
		
		if(age<18 || age>100) {
			throw new IllegalArgumentException("Not old enough or too old");
		}
		
		if(marks < 0 || marks>100) {
			throw new IllegalArgumentException("Invalid marks");
		}
		
		Student student = new Student(name, age, marks);
		return dao.saveStudent(student);
		
	}
	
	public Student getStudent(int id) {
		Student s = dao.findStudentById(id);
		if(s == null) {
			throw new IllegalArgumentException("student not found");
		}
		return s;
	}
	
	public void updateMarks(int id, double newMarks) {
		
		 if (newMarks < 0 || newMarks > 100) {
	            throw new IllegalArgumentException("Invalid marks");
	        }

	        Student s = dao.findStudentById(id);
	        
	        if (s == null) {
	            throw new IllegalArgumentException("Student not found");
	        }

	        dao.updateStudentMarks(id, newMarks);
	}
	
	public void deleteStudent(int id) {
		getStudent(id);
		dao.deleteStudentById(id);
	}
	
	public void giveCourseToStudent(int studentId, int courseId) {
	    dao.giveCourseToStudent(studentId, courseId);
	}
}
