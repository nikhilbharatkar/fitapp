package com.demo.fitapp.service;

import com.demo.fitapp.entity.Nutrition;

public interface NutritionalService {
	public Nutrition getNutritionalInfoByFoodName(String foodName, float gms);
}
