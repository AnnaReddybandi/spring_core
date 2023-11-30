package com.spring.setterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Driver {

	public static void main(String[] args) {
		 ClassPathResource cps=new ClassPathResource("bike.xml");
		 BeanFactory bf=new XmlBeanFactory(cps);
		     Bike bike= (Bike) bf.getBean("bike");
		     
		     bike.bikeDetails();
	}
}
