package com.cg.dto;

public class Security extends Capgemini {
double sal;
	@Override
	public double salary() {
		sal=1000;
		System.out.println(sal);
		return sal;
	}

	@Override
	public double commission() {
		
		return sal*0.5;
	}

}
