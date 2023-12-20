package com.example.termproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.termproject.entity.CarEntity;
import com.example.termproject.service.CarService;

@CrossOrigin(origins ="*")
@RestController
public class CarController {
	@Autowired
	public CarService carService;
	
	@GetMapping("/car")
	public List<CarEntity> getAllCarEntityList(){
		return carService.sendCarData();
	}
}
