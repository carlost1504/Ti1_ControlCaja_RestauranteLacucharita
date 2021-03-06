package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class Oder implements Serializable {
	
	public String code;
	public ArrayList<Dish>dish;
	public String state;
	public String orderDate;
	/**
	 * @param code
	 * @param dish
	 * @param state
	 * @param orderDate
	 */
	public Oder( ArrayList<Dish> dish, String state, String orderDate) {
		super();
		this.code  = UUID.randomUUID().toString();
		this.dish = dish;
		this.state = state;
		this.orderDate = orderDate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
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
	@Override
	public String toString() {
		return "-" + code + "-" + dish + "-" + state + "-" + orderDate + "\n";
	}
	
	
	
}
