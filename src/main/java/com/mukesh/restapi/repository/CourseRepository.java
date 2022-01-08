package com.mukesh.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mukesh.restapi.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
