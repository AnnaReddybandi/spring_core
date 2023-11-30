package com.spring.constructorDependency;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class carDriver {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("car.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		car car1 = (car) bf.getBean("mycar");

		System.out.println(car1.id);
		System.out.println(car1.brand);
		System.out.println(car1.color);
	}
}
