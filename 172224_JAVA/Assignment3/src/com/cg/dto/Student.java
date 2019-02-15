package com.cg.dto;

import java.util.Arrays;

public class Student extends Person {
	int count=0;
	private int numCourses;
	private String[] courses = {"JAVA","PYTHON","ORACLE"};
	private int[] grades = {90,80,70};

	public Student(String name, String address,int numCourses) {
		super(name, address);
		this.numCourses = 0;

	}

	@Override
	public String toString() {
		return "Student [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + ", grades="
				+ Arrays.toString(grades) + "]";
	}

	public void addCourseGrade()
	{
		for (int i=0; i<grades.length; i++)
		{
			System.out.println(grades[i]);
		}
		
		/*this.courses[numCourses] = courses;
		this.grades[numCourses] = grades;
		
		numCourses++;*/
	}

	public void printGrades() {
		
		System.out.println(getName());
		for (int i = 0; i < grades.length; i++)
		{
			System.out.println(courses[i] + ":" + grades[i]);
			count++;
		}
		System.out.println(count);

	}

	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		System.out.println("Average of Grades= "+ sum/count);
		return sum /count;

	}

}