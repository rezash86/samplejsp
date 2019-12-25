package com.carsystem.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private int id;
	private String name;
	private int year;
	private String color;
	private boolean isNew;
	private int doorType;
	
	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public int getDoorType() {
		return doorType;
	}

	public void setDoorType(int doorType) {
		this.doorType = doorType;
	}

	public Car() {
		
	}
	
	public Car(int id, String name, int year) {
		this.id = id;
		this.name = name;
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", year=" + year + ", color=" + color + ", isNew=" + isNew
				+ ", doorType=" + doorType + "]";
	}
	
	
}
