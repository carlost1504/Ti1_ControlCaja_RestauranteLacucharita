package model;

import java.util.ArrayList;

public class Oder {
	
	public int code;
	public ArrayList<Dish>dish;
	public String state;
	public String orderDate;
	/**
	 * @param code
	 * @param dish
	 * @param state
	 * @param orderDate
	 */
	public Oder(int code, ArrayList<Dish> dish, String state, String orderDate) {
		super();
		this.code = code;
		this.dish = dish;
		this.state = state;
		this.orderDate = orderDate;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public ArrayList<Dish> getDish() {
		return dish;
	}
	public void setDish(ArrayList<Dish> dish) {
		this.dish = dish;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
}
