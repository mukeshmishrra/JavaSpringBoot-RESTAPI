package com.mukesh.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mukesh.restapi.model.Course;
import com.mukesh.restapi.services.CourseServicesImpl;

@RestController
public class MyController {
	@Autowired
	private CourseServicesImpl courseService;
	
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return this.courseService.getAllCourses();
	}
	
	//getting single course by id
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable(value="id") long id) {
		return this.courseService.getCourseByID(id);
	}
	
	
	//inserting data
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addNewCourse(course);
	}
	
	
	//updating course
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.editCourse(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteCourses(@PathVariable(value="id") long id) {
		this.courseService.deleteCourse(id);
	}
	 	 
}