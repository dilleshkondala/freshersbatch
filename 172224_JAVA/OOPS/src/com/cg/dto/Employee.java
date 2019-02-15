package com.cg.dto;

public class Employee extends Capgemini {
	double sal;
	@Override
	public double salary() {
		 sal=5000;
		 System.out.println(sal);
		return sal;
	}

	@Override
	public double commission() {
		// TODO Auto-generated method stub
		return sal*0.2;
	}

}
