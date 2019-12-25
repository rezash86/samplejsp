package com.carsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.carsystem.model.Car;

@Service
public class CarServiceImpl implements CarService {

	List<Car> carList;
	
	public CarServiceImpl() {
		carList = new ArrayList<Car>();
		carList.add(new Car(1, "Toyota", 2019));
		carList.add(new Car(2, "Honda", 2018));
	}
	
	@Override
	public List<Car> getCars() {
		return carList;
	}

	@Override
	public void saveCar(Car car) {
		car.setId(carList.size() + 1);
		carList.add(car);
	}

}
