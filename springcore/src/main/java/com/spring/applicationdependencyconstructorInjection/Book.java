package com.spring.applicationdependencyconstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

	private int id;
	private String title;
	private String Goner;
	private Author author;
	public Book(@Value("1")int id,@Value("1983") String title,@Value("Biography") String goner,@Autowired Author author) {
		
		this.id = id;
		this.title = title;
		Goner = goner;
		this.author = author;
	}
	
	public void display1() {
		System.out.println("Book id :" + id);
		System.out.println("Book title :" + title);
		System.out.println("Book Goner :" + Goner);
		
		author.display();
	}
	
}
