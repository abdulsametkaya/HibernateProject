package com.project.service;

import com.project.domain.Course;

public interface ICourseService {
	
	public void createCourse(Course course);
	public void removeCourse(Course course);
	public Course findByIdCourse(int id);

}
