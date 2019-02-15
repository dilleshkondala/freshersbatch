package com.cg.app;

import com.cg.dto.Student;

public class StudentApp {

	public static void main(String[] args) {
	    Student st = new Student("Dillesh", "Ponduru");	  
	    st.setAddress("Ponduru");
	    System.out.println(st);  
	    System.out.println(st.getName());
	    System.out.println(st.getAddress());
	    st.addCourseGrade("JAVA", 9);
	    st.addCourseGrade("PYTHON", 8);
	    st.addCourseGrade("BOOTSTRAP", 6);
	    st.printGrades();
	    System.out.printf("The average grade is: " +st.getAverageGrade());
	 }

	}


