package com.carsystem.service;

import java.util.List;

import com.carsystem.model.Car;

public interface CarService {
	
	public List<Car> getCars();
	
	public void saveCar(Car car);
}
