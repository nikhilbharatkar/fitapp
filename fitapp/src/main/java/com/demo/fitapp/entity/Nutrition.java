package com.demo.fitapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="nutrition")

public class Nutrition {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	
	private String name;
	private float protein;
	private float carbs;
	private float saturatedFat;
	private float polyUnsaturatedFat;
	private float monoUnsaturatedFat;
	private float potassium;
	private float sodium;
	private float fibre;
	private float sugar;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getProtein() {
		return protein;
	}
	public void setProtein(float protein) {
		this.protein = protein;
	}
	public float getCarbs() {
		return carbs;
	}
	public void setCarbs(float carbs) {
		this.carbs = carbs;
	}
	public float getSaturatedFat() {
		return saturatedFat;
	}
	public void setSaturatedFat(float saturatedFat) {
		this.saturatedFat = saturatedFat;
	}
	public float getPolyUnsaturatedFat() {
		return polyUnsaturatedFat;
	}
	public void setPolyUnsaturatedFat(float polyUnsaturatedFat) {
		this.polyUnsaturatedFat = polyUnsaturatedFat;
	}
	public float getMonoUnsaturatedFat() {
		return monoUnsaturatedFat;
	}
	public void setMonoUnsaturatedFat(float monoUnsaturatedFat) {
		this.monoUnsaturatedFat = monoUnsaturatedFat;
	}
	public float getPotassium() {
		return potassium;
	}
	public void setPotassium(float potassium) {
		this.potassium = potassium;
	}
	public float getSodium() {
		return sodium;
	}
	public void setSodium(float sodium) {
		this.sodium = sodium;
	}
	public float getFibre() {
		return fibre;
	}
	public void setFibre(float fibre) {
		this.fibre = fibre;
	}
	public float getSugar() {
		return sugar;
	}
	public void setSugar(float sugar) {
		this.sugar = sugar;
	}
}
