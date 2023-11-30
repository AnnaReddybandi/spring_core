package com.spring.applicationdependencyconstructorInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Author {

	 private int id;
	 private String name;
	 private  int age;
	public Author(@Value("1") int id,@Value("Vijay")String name,@Value("23") int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	 
	 public void display() {
		 System.out.println("Author id : "+id);
		 System.out.println("Author name : "+name);
		 System.out.println("Author age : "+age);
	 }
	 
}
