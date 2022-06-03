package com.project.service;

import com.project.domain.Student;

import service.project.repository.StudentRepository;

public class StudentServiceImpl implements IStudentService {

	private final static StudentRepository repo = new StudentRepository();
	
	@Override
	public void createStudent(Student student) {
		repo.createStudent(student);
	}

	@Override
	public void removeStudent(Student student) {
		
		repo.removeStudent(student);
		
	}

	@Override
	public Student findByIdStudent(int id) {
		
		return repo.findByIdStudent(id);
	}

}
