package com.demo.fitapp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.demo.fitapp.entity.Nutrition;

public interface NutritionRepository extends CrudRepository<Nutrition, Integer>{
	public List<Nutrition> findByName(String name);
}
