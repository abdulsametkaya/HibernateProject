package com.project.main;

import com.project.domain.Adress;
import com.project.domain.Course;
import com.project.domain.Student;
import com.project.domain.Teacher;
import com.project.domain.enums.BranchType;
import com.project.domain.enums.CityType;
import com.project.domain.enums.ClassNumberType;
import com.project.domain.enums.LocationType;
import com.project.service.AdressServiceImpl;
import com.project.service.CourseServiceImpl;
import com.project.service.IAdressService;
import com.project.service.ICourseService;
import com.project.service.IStudentService;
import com.project.service.ITeacherService;
import com.project.service.StudentServiceImpl;
import com.project.service.TeacherServiceImpl;

public class Client {

	public static void main(String[] args){
		
		IAdressService adressService = new AdressServiceImpl();
		ICourseService courseService = new CourseServiceImpl();
		IStudentService studentService = new StudentServiceImpl();
		ITeacherService teacherService = new TeacherServiceImpl();
		
		Adress adres1 = new Adress();
		Adress adres2 = new Adress();
		
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher();
		
		Course course1 = new Course();
		Course course2 = new Course();
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		adres1.setMahalle("Yorkshire Berkeley");
		adres1.setSokak("127/B Street");
		adres1.setCity(CityType.BURSA);
		
		
		adres2.setMahalle("Yellow Boluevard");
		adres2.setSokak("127/B Street");
		adres2.setCity(CityType.ISTANBUL);
		
		course1.setName("Matematik");
		course1.setCourseLocation(LocationType.REMOTE);
		course1.setTeacher(teacher2);
		
		
		course2.setName("Fizik");
		course2.setCourseLocation(LocationType.FACETOFACE);
		course2.setTeacher(teacher1);
		
		teacher1.setName("Walter H.");
		teacher1.setSurname("White");
		teacher1.setAdres(adres1);
		teacher1.getCourse().add(course2);
		teacher1.getCourse().add(course1);
		teacher1.setBranchType(BranchType.BIYOLOJI);
		
		teacher2.setName("Theodore");
		teacher2.setSurname("Bagwell");
		teacher2.setAdres(adres2);
		teacher2.getCourse().add(course2);
		teacher2.getCourse().add(course1);
		teacher2.setBranchType(BranchType.FIZIK);	
		
		student1.setName("Boris");
		student1.setSurname("Yeltsin");
		student1.setClassNumber(ClassNumberType.LISE2);
		student1.setAge(55);
		student1.setAdres(adres1);
		student1.getCourse().add(course2);
		student1.getCourse().add(course1);
		
		student2.setName("Cahar");
		student2.setSurname("Dudayev");
		student2.setClassNumber(ClassNumberType.LISE3);
		student2.setAge(45);
		student2.setAdres(adres2);
		student2.getCourse().add(course2);
		student2.getCourse().add(course1);
		
		
		
		studentService.createStudent(student2);
		studentService.createStudent(student1);

		courseService.createCourse(course1);
		courseService.createCourse(course2);
		
		adressService.createAdress(adres1);
		adressService.createAdress(adres2);
		
		
		teacherService.createTeacher(teacher2);
		teacherService.createTeacher(teacher1);
		
		
		

	}

}
