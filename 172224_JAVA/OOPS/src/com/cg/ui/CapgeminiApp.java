package com.cg.ui;

import com.cg.dto.Employee;
import com.cg.dto.Security;
import com.cg.dto.Worker;

public class CapgeminiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Worker w=new Worker();
		Security s=new Security();
		e.display();
		e.salary();
		w.display();
		w.salary();
		s.display();
		s.salary();
		

	}

}
