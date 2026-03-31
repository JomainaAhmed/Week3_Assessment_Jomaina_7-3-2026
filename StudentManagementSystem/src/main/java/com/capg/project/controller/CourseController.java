package com.capg.project.controller;

import com.capg.project.entity.Course;
import com.capg.project.service.CourseService;

public class CourseController {

    private static CourseService courseService = new CourseService();

    public static void main(String[] args) {

        // create course
        Course course = new Course();
        course.setName("Java");
        course.setTrainer("Rahul");

        courseService.saveCourse(course);

        System.out.println("Course created successfully!");

//        // find course
//        Course found = courseService.findCourseById(1);
//        System.out.println(found);
//
//        // update trainer
//        courseService.updateCourseTrainer(1, "Sneha");
//
//        // delete
//        // courseService.deleteCourseById(1);
    }
}