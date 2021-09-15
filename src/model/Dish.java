package model;

import java.util.ArrayList;

public class Dish {

	public String name;
	public double price;
	public ArrayList<Ingredient> ingredient;
	/**
	 * @param name
	 * @param price
	 * @param ingredient
	 */
	public Dish(String name, double price, ArrayList<Ingredient> ingredient) {
		super();
		this.name = name;
		this.price = price;
		this.ingredient = ingredient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ArrayList<Ingredient> getIngredient() {
		return ingredient;
	}
	public void setIngredient(ArrayList<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}
	
	
	
	
}
