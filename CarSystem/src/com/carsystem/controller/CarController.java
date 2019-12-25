package com.carsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.carsystem.model.Car;
import com.carsystem.service.CarService;

@Controller
public class CarController {
	
	@Autowired
	CarService service;
	
	
	
	@RequestMapping("/")
	public ModelAndView getCars() {
		ModelAndView mav = new ModelAndView("car-list");
		List<Car> cars = service.getCars();
		mav.addObject("car", new Car());
		mav.addObject("cars", cars);
		
		return mav;		
	}
	
	@RequestMapping(value =  "/save", method = RequestMethod.POST)
	public String saveCar(@ModelAttribute("car") Car savedCar) {
		System.out.println(savedCar);
		service.saveCar(savedCar);
		return "redirect:/"; 
		
	}
	
	@RequestMapping(value="/edit")
	public String editCar(@RequestParam("carid") int editedCarId) {
		System.out.println(editedCarId);
		return "redirect:/";
	}

		
}
