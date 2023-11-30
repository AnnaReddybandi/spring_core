package com.spting.setterdependencyByusingSetter;

public class Car {

  private int id;
  private String brand;
  private String color;
	
  private engine engine1;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public engine getEngine1() {
	return engine1;
}

public void setEngine1(engine engine1) {
	this.engine1 = engine1;
}
  public void cardetailes() {
	  System.out.println("id :" + " ="+ id);
	  System.out.println("brand :" + " ="+ brand);
	  System.out.println("color :" + " ="+ color);
	  System.out.println("engine1 :" + " ="+ engine1);
  }
}
