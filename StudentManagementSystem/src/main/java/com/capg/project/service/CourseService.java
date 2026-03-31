package com.capg.project.service;

import com.capg.project.dao.CourseDao;
import com.capg.project.entity.Course;

public class CourseService {

    private CourseDao courseDao = new CourseDao();

    // SAVE
    public Course saveCourse(Course course) {
        return courseDao.saveCourse(course);
    }

    // FIND
    public Course findCourseById(int id) {
        return courseDao.findCourseById(id);
    }

    // UPDATE
    public void updateCourseTrainer(int id, String trainer) {
        courseDao.updateCourseTrainer(id, trainer);
    }

    // DELETE
    public void deleteCourseById(int id) {
        courseDao.deleteCourseById(id);
    }
}