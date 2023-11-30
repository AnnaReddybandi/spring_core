package com.spring.application_setterInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  // class is assosiated with component then ioc container will craete the objects
public class School {

	private int id;
	private String name;
	private String loc;
	private int Strength;
	public int getId() {
		return id;
	}
	@Value("1000")  // @Value annotation
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("Ravichandra")
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	@Value("Galiveedu")
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getStrength() {
		return Strength;
	}
	@Value("100000")
	public void setStrength(int strength) {
		Strength = strength;
	}
	
}
