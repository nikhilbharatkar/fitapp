package com.demo.fitapp.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class NixFoodBean {
	List<Food> foods;

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}


	@JsonIgnoreProperties(ignoreUnknown=true)
	public static class Food {
		@JsonProperty("food_name")
		private String foodName;
        
		@JsonProperty("serving_weight_grams")
		private int servingWeightGrams;
		
		@JsonProperty("nf_calories")
		private int calories;
		
		@JsonProperty("nf_total_fat")
		private float totalFat;
		
		@JsonProperty("nf_saturated_fat")
		private float saturatedFat;
		
		@JsonProperty("nf_cholesterol")
		private float cholesterol;
		
		@JsonProperty("nf_sodium")
		private float sodium;
		
		@JsonProperty("nf_total_carbohydrate")
		private float totalCarbohydrate;
		
		@JsonProperty("nf_dietary_fiber")
		private float dietaryFiber;
		
		@JsonProperty("nf_sugars")
		private float sugars;
		
		@JsonProperty("nf_protein")
		private float protein;
		
		@JsonProperty("nf_potassium")
		private float potassium;
		
		@JsonProperty("nf_p")
		private float p;

		public String getFoodName() {
			return foodName;
		}

		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}

		public int getServingWeightGrams() {
			return servingWeightGrams;
		}

		public void setServingWeightGrams(int servingWeightGrams) {
			this.servingWeightGrams = servingWeightGrams;
		}

		public int getCalories() {
			return calories;
		}

		public void setCalories(int calories) {
			this.calories = calories;
		}

		public float getTotalFat() {
			return totalFat;
		}

		public void setTotalFat(float totalFat) {
			this.totalFat = totalFat;
		}

		public float getSaturatedFat() {
			return saturatedFat;
		}

		public void setSaturatedFat(float saturatedFat) {
			this.saturatedFat = saturatedFat;
		}

		public float getCholesterol() {
			return cholesterol;
		}

		public void setCholesterol(float cholesterol) {
			this.cholesterol = cholesterol;
		}

		public float getSodium() {
			return sodium;
		}

		public void setSodium(float sodium) {
			this.sodium = sodium;
		}

		public float getTotalCarbohydrate() {
			return totalCarbohydrate;
		}

		public void setTotalCarbohydrate(float totalCarbohydrate) {
			this.totalCarbohydrate = totalCarbohydrate;
		}

		public float getDietaryFiber() {
			return dietaryFiber;
		}

		public void setDietaryFiber(float dietaryFiber) {
			this.dietaryFiber = dietaryFiber;
		}

		public float getSugars() {
			return sugars;
		}

		public void setSugars(float sugars) {
			this.sugars = sugars;
		}

		public float getProtein() {
			return protein;
		}

		public void setProtein(float protein) {
			this.protein = protein;
		}

		public float getPotassium() {
			return potassium;
		}

		public void setPotassium(float potassium) {
			this.potassium = potassium;
		}

		public float getP() {
			return p;
		}

		public void setP(float p) {
			this.p = p;
		}

		
	}
}
