package com.cg.dto;

import java.util.Arrays;

public class Teacher extends Person {

		private String[] courses;
		private int numCourses;

		public Teacher(String name, String address) {
			super(name, address);
			numCourses = 0;
			courses = new String[30];
		}

		

		@Override
		public String toString() {
			return "Teacher [courses=" + Arrays.toString(courses) + ", numCourses=" + numCourses + "]";
		}


		public boolean addCourse(String Course) {
			boolean existed = false;
			for (int i = 0; i < numCourses; i++) {
				if (Course.equals(courses[i])) {
					existed = true;
				}
			}
			if (existed == false) {
				courses[numCourses] = Course;
				numCourses++;
				return true;
			}
			
			else {
			return false;
			}
	}

}