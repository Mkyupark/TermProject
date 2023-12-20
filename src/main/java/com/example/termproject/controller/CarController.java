package com.example.termproject.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.termproject.entity.CarEntity;
import com.example.termproject.service.CarService;

import jakarta.servlet.http.HttpServletRequest;

@CrossOrigin(origins ="*")
@RestController
public class CarController {
	@Autowired
	public CarService carService;
	
	@GetMapping("/car")
	public List<CarEntity> getAllCarEntityList(){
		return carService.sendCarData();
	}
	
	@GetMapping("/company")
	public List<CarEntity> getByCompanyNameCarEntityList(HttpServletRequest request){
		String companyname = request.getParameter("hi");
		return carService.findByCompanyName(companyname);
	}
}
