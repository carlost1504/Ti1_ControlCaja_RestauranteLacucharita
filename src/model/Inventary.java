package model;

public class Inventary {
	private String name;
	private String Units;
	private int amount;
	/**
	 * @param name
	 * @param units
	 * @param amount
	 */
	public Inventary(String name, String units, int amount) {
		super();
		this.name = name;
		Units = units;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnits() {
		return Units;
	}
	public void setUnits(String units) {
		Units = units;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
