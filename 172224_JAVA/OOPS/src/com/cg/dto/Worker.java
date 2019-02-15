package com.cg.dto;

public class Worker extends Capgemini {
double sal;
	@Override
	public double salary() {
		 sal=3000;
		 System.out.println(sal);
		return sal;
	}

	@Override
	public double commission() {
		
		return sal*0.1;
	}

}
