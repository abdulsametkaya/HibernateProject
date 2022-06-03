package com.project.service;

import com.project.domain.Course;

import service.project.repository.CourseRepository;

public class CourseServiceImpl implements ICourseService{

	private final static CourseRepository repo = new CourseRepository();
	
	@Override
	public void createCourse(Course course) {
		repo.createCourse(course);
		
	}

	@Override
	public void removeCourse(Course course) {
		repo.removeCourse(course);
		
	}

	@Override
	public Course findByIdCourse(int id) {
		return repo.findByIdCourse(id);
	}

	
}
