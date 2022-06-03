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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.project.domain.enums.ClassNumberType;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 5,name = "Student_Id")
	private int id;
	
	@Column(name = "Student_Name",length = 30,nullable = false)
	private String name;

	@Column(name = "Student_Surname",length = 30,nullable = false)
	private String surname;
	
	@Enumerated(EnumType.STRING)
	private ClassNumberType classNumber;
	
	@Column(name = "Student_Age",length = 4)
	private int age;
	
	@OneToOne(mappedBy = "student",
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER)
	private Adress adres;
	
	//Student/Course
	@ManyToMany(fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Courses",
	joinColumns = {@JoinColumn(name="Student_Id")},
	inverseJoinColumns = {@JoinColumn(name="Course_Id")})
	private List<Course> course = new ArrayList<>();

	public Student() {
	}
	
	public Student(String name, String surname, ClassNumberType classNumber, int age) {
		this.name = name;
		this.surname = surname;
		this.classNumber = classNumber;
		this.age = age;
		
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ClassNumberType getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(ClassNumberType classNumber) {
		this.classNumber = classNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adress getAdres() {
		return adres;
	}

	public void setAdres(Adress adres) {
		this.adres = adres;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", classNumber=" + classNumber
				+ ", age=" + age + ", adres=" + adres + ", course=" + course + "]";
	}
	
	
	
	
	
	
	
	
}
