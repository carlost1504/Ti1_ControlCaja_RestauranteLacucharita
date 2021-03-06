package model;

import java.io.Serializable;

public class Ingredient implements Serializable {

	public String name;
	public int amount;
	/**
	 * @param name
	 * @param amount
	 */
	public Ingredient(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "-" + name + "-" + amount + "\n";
	}
	
	
}
