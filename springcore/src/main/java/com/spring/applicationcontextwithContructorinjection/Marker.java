package com.spring.applicationcontextwithContructorinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Marker {
	int id;
	String Brand;
	double price;
	public Marker(@Value("1") int id, @Value("camlin")String brand,@Value("10.00 ") double price) {
		
		this.id = id;
		Brand = brand;
		this.price = price;
	}
	
	public void markerdetails() {
		System.out.println(id);
		System.out.println(Brand);
		System.out.println(price);
	}
	
}
