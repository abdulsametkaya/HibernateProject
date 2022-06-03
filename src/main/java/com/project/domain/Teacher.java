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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.project.domain.enums.BranchType;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 5,name = "Teacher_Id")
	private int id;

	@Column(name = "Teacher_Name",length = 30,nullable = false)
	private String name;
	
	@Column(name = "Teacher_Surname",length = 30,nullable = false)
	private String surname;
	
	@Enumerated(EnumType.STRING)
	private BranchType branchType;
	
	@OneToMany(fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,
			mappedBy = "teacher")
	private List<Course> course = new ArrayList<>();
	
	@OneToOne(mappedBy = "teacher",
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER)
	private Adress adres;

	public Teacher() {
	}
	
	public Teacher(String name, String surname, BranchType branchType) {
		this.name = name;
		this.surname = surname;
		this.branchType = branchType;
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

	public BranchType getBranchType() {
		return branchType;
	}

	public void setBranchType(BranchType branchType) {
		this.branchType = branchType;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Adress getAdres() {
		return adres;
	}

	public void setAdres(Adress adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", surname=" + surname + ", branchType=" + branchType +"]";
	}
	
	
	
	
	
	
	
}
