package com.spring.application_setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class schoolDriver {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("school.xml");
		School sc=(School) applicationContext.getBean("school");
		  
		System.out.println(sc.getId());
		System.out.println(sc.getName());
		System.out.println(sc.getLoc());
		System.out.println(sc.getStrength());
		
		
	}
}
