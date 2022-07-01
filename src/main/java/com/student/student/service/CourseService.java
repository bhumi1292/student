package com.student.student.service;

import com.student.student.entity.Courses;

import java.util.List;

public interface CourseService {
    public List<Courses> getCourses();
    public Courses getCourses(long courseId);

    public Courses addCourses(Courses course);

    public Courses updateCourses(Courses course);
    public void deletecourse(long courseId);
}
