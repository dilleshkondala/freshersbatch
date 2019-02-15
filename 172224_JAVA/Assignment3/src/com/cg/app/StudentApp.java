package com.cg.app;

import com.cg.dto.Person;
import com.cg.dto.Student;
import com.cg.dto.Teacher;

public class StudentApp {

	public static void main(String[] args) {
		
		Person p1 = new Person("Dillesh", "Ponduru");
		Teacher t1 = new Teacher("Shashi", "Bangalore");
		Student s1 = new Student("Dillesh-Student", "PNDR",3);
		s1.addCourseGrade();
		s1.printGrades();
		s1.getAverageGrade();
		
		
	}

}
