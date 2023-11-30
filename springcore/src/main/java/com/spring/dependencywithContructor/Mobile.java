package com.spring.dependencywithContructor;

public class Mobile {

	int id;
    String brand;
    String model;
    Battery battery;
	public Mobile(int id, String brand, String model, Battery battery) {
		
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.battery = battery;
	}
    
    
}
