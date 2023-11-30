package com.spring.applicationdependencyconstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDriver {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Author_book.xml");
		 Book book=(Book) applicationContext.getBean("book");
		 
		 book.display1();
	}
}
