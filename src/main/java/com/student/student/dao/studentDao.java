package com.student.student.dao;

import com.student.student.entity.Courses;

import org.springframework.data.jpa.repository.JpaRepository;


public interface studentDao extends JpaRepository<Courses, Long> {
}
