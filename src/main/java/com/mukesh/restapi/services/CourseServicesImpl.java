package com.mukesh.restapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mukesh.restapi.model.Course;
import com.mukesh.restapi.repository.CourseRepository;

@Service
public class CourseServicesImpl implements CourseServices{
	@Autowired
	private CourseRepository courseRepository;

	//getting all courses
	public List<Course> getAllCourses() {
		
		return courseRepository.findAll() ;
	}

	//getting courses by specific id
	public Course getCourseByID(long id) {
		Optional<Course> optional = courseRepository.findById(id);
		Course c = null;
		if(optional.isPresent()) {
			optional.get();
			
		}else {
			throw new RuntimeException("id not found in the database"+id);
		}
		return c;
	}
	
	
	//inserting new courses 
	public Course addNewCourse(Course course) {
		
		return courseRepository.save(course);
	}

	//updating existing course
	public Course editCourse(Course course) {
		return courseRepository.save(course);
	}

	//delete existing courses
	public void deleteCourse(long id) {
		courseRepository.deleteById(id) ;
		
	}
	
}