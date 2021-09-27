package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Dish implements Serializable {

	public String name;
	public double price;
	public ArrayList<Inventary> Product;
	/**
	 * @param name
	 * @param price
	 * @param ingredient
	 */
	
	
	public Dish(String name, double price, ArrayList<Inventary> Product) {
		this.name = name;
		this.price = price;
		this.Product = Product;
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


	public ArrayList<Inventary> getProduct() {
		return Product;
	}


	public void setProduct(ArrayList<Inventary> product) {
		Product = product;
	}


	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + ", Product=" + Product + "]";
	}
	
	
	
	
	
	
	
}
