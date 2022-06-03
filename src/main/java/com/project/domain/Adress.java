package com.project.domain;

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
import javax.persistence.OneToOne;

import com.project.domain.enums.CityType;

@Entity
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 5,name = "Adres_Id")
	private int id;
	
	@Column(length = 50)
	private String mahalle;
	
	@Column(length = 50)
	private String sokak;
	
	@Enumerated(EnumType.STRING)
	private CityType city;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Student_Id")
	private Student student;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Teacher_Id")
	private Teacher teacher;

	public Adress() {
	}
	
	public Adress(String mahalle, String sokak, CityType city) {
		this.mahalle = mahalle;
		this.sokak = sokak;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	
	public CityType getCity() {
		return city;
	}

	public void setCity(CityType city) {
		this.city = city;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
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
		return "Adress [id=" + id + ", mahalle=" + mahalle + ", sokak=" + sokak + ", city=" + city + "]";
	}
	
	
	
	
	
	
}
