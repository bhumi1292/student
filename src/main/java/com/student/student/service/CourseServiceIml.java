package com.student.student.service;

import com.student.student.dao.studentDao;
import com.student.student.entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceIml implements  CourseService{
    @Autowired
    private studentDao sdao;
  //  List<Courses> list;

    public CourseServiceIml(){
       /* list = new ArrayList<>();
        list.add(new Courses(125,"Ami","Java"));
        list.add(new Courses(12,"Bhumi","php"));
*/
    }


    @Override
    public List<Courses> getCourses() {

        return sdao.findAll();
    }

    @Override
    public Courses getCourses(long courseId) {

        /*Courses c = null;
        for(Courses course :list){
            if(course.getId() == courseId){
                c=course;
                break;
            }*/
        //}
        return sdao.getOne(courseId);
    }

    @Override
    public Courses addCourses(Courses course) {

        return sdao.save(course);
    }

    @Override
    public Courses updateCourses(Courses course) {
       /* list.forEach( e -> {
            if(e.getId() == course.getId()){
                e.setName(course.getName());
                e.setCourses(course.getCourses());
            }
        });*/
        sdao.save(course);
        return course;
    }

    @Override
    public void deletecourse(long parseLong) {
        //list= this.list.stream().filter(e-> e.getId()!= parseLong).collect(Collectors.toList());
        Courses entity = sdao.getOne(parseLong);
        sdao.delete(entity);
    }
}
