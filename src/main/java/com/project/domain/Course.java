package com.project.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.project.domain.enums.LocationType;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 5,name = "Course_Id")
	private int id;
	
	@Column(name = "Course_Name",length = 30,nullable = false)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private LocationType courseLocation;
	
	//Student/Course
	@ManyToMany(fetch = FetchType.LAZY,
			mappedBy = "course")
	private List<Student> student = new ArrayList<>();

	//Teacher/Course bağlantısı
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Teacher_Id")
	private Teacher teacher;

	public Course() {
	}
	
	public Course(String name, LocationType courseLocation) {
		this.name = name;
		this.courseLocation = courseLocation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocationType getCourseLocation() {
		return courseLocation;
	}

	public void setCourseLocation(LocationType courseLocation) {
		this.courseLocation = courseLocation;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", courseLocation=" + courseLocation + "]";
	}
	
	
	
	
	
	
}
