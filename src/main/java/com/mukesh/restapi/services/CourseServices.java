package com.mukesh.restapi.services;

import java.util.List;

import com.mukesh.restapi.model.Course;

public interface CourseServices {
	public List<Course> getAllCourses();
	public Course getCourseByID(long id);
	public Course addNewCourse(Course course);
	public Course editCourse(Course course);
	public void deleteCourse(long id);

}
