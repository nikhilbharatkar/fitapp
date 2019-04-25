package com.demo.fitapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.fitapp.beans.NixFoodBean;
import com.demo.fitapp.entity.Nutrition;
import com.demo.fitapp.proxy.NixProxy;
import com.demo.fitapp.repositories.NutritionRepository;
import com.demo.fitapp.util.FitAppNixUtil;

@Service
public class NutritionalServiceImpl implements NutritionalService {
	private final NutritionRepository repository;
	private final NixProxy nixProxy;

	@Autowired
	public NutritionalServiceImpl(NutritionRepository repository, NixProxy nixProxy) {
		this.repository = repository;
		this.nixProxy = nixProxy;
	}

	@Override
	public Nutrition getNutritionalInfoByFoodName(String foodName, float gms) {
		List<Nutrition> nutritions;
		if((nutritions = repository.findByName(foodName)).isEmpty()) {
			Nutrition nutrition;
			nutrition = repository.save(mapper(nixProxy.getNutritionalDetailsByFoodName(foodName)));
			return FitAppNixUtil.factorItByGms(gms, nutrition);
		}
		return FitAppNixUtil.factorItByGms(gms, nutritions.get(0));
	}
	
	private Nutrition mapper(NixFoodBean.Food bean) {
		Nutrition nutrition = new Nutrition();
		nutrition.setCarbs(bean.getTotalCarbohydrate()/bean.getServingWeightGrams());
		nutrition.setFibre(bean.getDietaryFiber()/bean.getServingWeightGrams());
		nutrition.setMonoUnsaturatedFat((bean.getTotalFat()-bean.getSaturatedFat())/bean.getServingWeightGrams());
		nutrition.setPolyUnsaturatedFat((bean.getTotalFat()-bean.getSaturatedFat())/bean.getServingWeightGrams());
		nutrition.setSaturatedFat(bean.getSaturatedFat()/bean.getServingWeightGrams());
		nutrition.setName(bean.getFoodName());
		nutrition.setPotassium(bean.getPotassium()/bean.getServingWeightGrams());
		nutrition.setProtein(bean.getProtein()/bean.getServingWeightGrams());
		nutrition.setSugar(bean.getSugars()/bean.getServingWeightGrams());
		return nutrition;
	}
}
