package com.student.student.controller;


import com.student.student.entity.Courses;
import com.student.student.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class MyController {
    @Autowired
    private CourseService corservice;


    @GetMapping("/home")
    public String home(){
        return "Wellcome to Student page";
    }

    // get the courses
    @GetMapping("/courses")
    public List<Courses> getCourses(){

        return this.corservice.getCourses();
    }

    //get course with id


    @GetMapping("/courses/{courseId}")
    public Courses getCourses(@PathVariable String courseId){
        return this.corservice.getCourses(Long.parseLong(courseId));
    }

    //insert course
    @PostMapping("/courses")
    public Courses addCourses(@RequestBody Courses course){

        return  this.corservice.addCourses(course);
    }

    //update course
    @PutMapping("/courses")
    public  Courses updateCourse(@RequestBody Courses course){
        return this.corservice.updateCourses(course);
    }

    //delete course
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpEntity> delete(@PathVariable String courseId){
        try{
        this.corservice.deletecourse(Long.parseLong(courseId));
        return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
