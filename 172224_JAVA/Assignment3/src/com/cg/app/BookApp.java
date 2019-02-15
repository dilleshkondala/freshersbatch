package com.cg.app;

import com.cg.dto.Author;
import com.cg.dto.Book;

public class BookApp {

	public static void main(String[] args) {
		
		Author a1= new Author("Dillesh","dillesh@gmail.com",'M');
		Book b=new Book("java");
		b.setPrice(800.00);
		b.setQty(20);
		System.out.println(b);
		
	}

}
