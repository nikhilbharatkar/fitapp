package com.demo.fitapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.fitapp.config.NixConfig;
import com.demo.fitapp.entity.Nutrition;
import com.demo.fitapp.service.NutritionalService;

@RestController
public class NutritionalDetailController {
	private final NutritionalService nutritionalService;
	//private final NixConfig config;
		

	@Autowired
	public NutritionalDetailController(NutritionalService nutritionalService) {
		super();
		this.nutritionalService = nutritionalService;
		
	}



	@GetMapping("/")
	public Nutrition getNutritionalInfoByFoodName(@RequestParam String query, @RequestParam float gms) {
		return nutritionalService.getNutritionalInfoByFoodName(query, gms);
	}
}
