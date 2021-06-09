package com.vivek.code.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

	@JsonProperty("Gender")
	String gender;
	@JsonProperty("HeightCm")
	double heightCm;
	@JsonProperty("WeightKg")
	double weightKg;
	double BMI;
	String BMICategory;
	String HealthRisk;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeightCm() {
		return heightCm;
	}

	public void setHeightCm(double heightCm) {
		this.heightCm = heightCm;
	}

	public double getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(double weightKg) {
		this.weightKg = weightKg;
	}

	public double getBMI() {
		return BMI;
	}

	public void setBMI(double bMI) {
		this.BMI = bMI;
	}

	public String getBMICategory() {
		return BMICategory;
	}

	public void setBMICategory(String bMICategory) {
		this.BMICategory = bMICategory;
	}

	public String getHealthRisk() {
		return HealthRisk;
	}

	public void setHealthRisk(String healthRisk) {
		this.HealthRisk = healthRisk;
	}

}
