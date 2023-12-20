package com.example.termproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.termproject.entity.CarEntity;
import com.example.termproject.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	CarRepository carRepository;
	
	@Autowired
	public List<CarEntity> sendCarData(){
		return carRepository.findAll();
	}
	
    public List<CarEntity> findByCompanyName(String companyName) {
        return carRepository.findAllByCompanyName(companyName);
    }
}
