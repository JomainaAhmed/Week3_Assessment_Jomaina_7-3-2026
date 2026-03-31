package com.capg.project.controller;

import com.capg.project.service.StudentService;

public class StudentController {
	
	private static StudentService stu = new StudentService();
	
	public static void main(String[]args) {
		//stu.registerStudent("XYZO", 99, 35.55);
		//stu.updateMarks(1, 30);
		
		stu.giveCourseToStudent(1, 1);

        System.out.println("Course assigned to student!");
		
	}

}
