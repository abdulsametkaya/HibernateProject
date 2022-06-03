package com.project.service;

import com.project.domain.Student;

public interface IStudentService {
	
	public void createStudent(Student student);
	public void removeStudent(Student student);
	public Student findByIdStudent(int id);

}
