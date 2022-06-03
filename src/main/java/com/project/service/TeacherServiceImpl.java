package com.project.service;

import com.project.domain.Teacher;

import service.project.repository.TeacherRepository;

public class TeacherServiceImpl implements ITeacherService {
	
	private final static TeacherRepository repo = new TeacherRepository();

	@Override
	public void createTeacher(Teacher teacher) {
		repo.createTeacher(teacher);
		
	}

	@Override
	public void removeTeacher(Teacher teacher) {
		repo.removeTeacher(teacher);
		
	}

	@Override
	public Teacher findByIdTeacher(int id) {
		return repo.findByIdTeacher(id);
		
	}

	@Override
	public Teacher UpdateTeacher(int id,String name) {

		return repo.UpdateTeacher(id,name);
	}
	
	

}
