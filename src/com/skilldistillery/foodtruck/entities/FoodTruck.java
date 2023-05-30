package com.skilldistillery.foodtruck.entities;

import java.util.Arrays;
import java.util.Objects;

public class FoodTruck {
	private  static int currentNumberOfTruck = 1;
	private int id;
	private String name;
	private String foodType;
	private double rating;
	
	
	public FoodTruck() {
		
	}
	
	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.foodType =foodType;
		this.rating = rating;
		this.id =currentNumberOfTruck++;
	}
	public void displayTruck() {
		String truckData = toString();
		System.out.println(truckData);
	}
	
	public String toString() {
		return "FoodTruck [id=" + id + ", name=" + name + ", foodType=" + foodType + ", rating=" + rating + "]";
	}
	public static int getCurrentNumberOfTrucks() {
		return currentNumberOfTruck;
	}
	public static void setCurrentNumberOfTrucks(int currentNumberOfTruck) {
		FoodTruck.currentNumberOfTruck = currentNumberOfTruck;
	}
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
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public int hashCode() {
		return Objects.hash(foodType, id, name, rating);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodTruck other = (FoodTruck) obj;
		return Objects.equals(foodType, other.foodType) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating);
	}
	
	
	
}
