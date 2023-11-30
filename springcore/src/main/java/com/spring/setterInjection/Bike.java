package com.spring.setterInjection;

public class Bike {

	private int id;
	private String model;
	private String brand;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public  void bikeDetails() {
		System.out.println("id : " + id);
		System.out.println("model : " + model);
		System.out.println("brand : " + brand);
		System.out.println("color : " + color);
	}
	
}
