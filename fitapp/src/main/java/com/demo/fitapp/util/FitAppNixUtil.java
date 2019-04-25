package com.demo.fitapp.util;

import com.demo.fitapp.entity.Nutrition;

public class FitAppNixUtil {
	private FitAppNixUtil() {
		//no need of creating objects from
		//outside class
	}

	public static Nutrition factorItByGms(float gms, Nutrition nutrition) {
		nutrition.setCarbs(nutrition.getCarbs()*gms);
		nutrition.setFibre(nutrition.getFibre()*gms);
		nutrition.setMonoUnsaturatedFat((nutrition.getMonoUnsaturatedFat()-nutrition.getSaturatedFat())*gms);
		nutrition.setPolyUnsaturatedFat((nutrition.getPolyUnsaturatedFat()-nutrition.getSaturatedFat())*gms);
		nutrition.setSaturatedFat(nutrition.getSaturatedFat()*gms);
		nutrition.setName(nutrition.getName());
		nutrition.setPotassium(nutrition.getPotassium()*gms);
		nutrition.setProtein(nutrition.getProtein()*gms);
		nutrition.setSugar(nutrition.getSugar()*gms);
		return nutrition;
	}
}
