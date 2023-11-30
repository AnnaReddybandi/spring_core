package com.spring_applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TubeLightDriver {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("tubelight.xml");
		
		   TubeLight tc=(TubeLight)applicationContext.getBean("tubeLight");
		
		 tc.m1();
		
		
	}
	
	
	
}
