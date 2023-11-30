package com.spring.applicationcontextwithContructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverMarker {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appConConstructoreInject.xml");
		Marker marker=(Marker) applicationContext.getBean("marker");
		   marker.markerdetails();
	}
}
