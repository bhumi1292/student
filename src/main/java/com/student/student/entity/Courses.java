package com.student.student.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses
{
    @Id

    private long id;
    private String name;
    private String courses;


    public Courses() {
    }

    public Courses(long id, String name, String courses) {
        super();
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses='" + courses + '\'' +
                '}';
    }

}
