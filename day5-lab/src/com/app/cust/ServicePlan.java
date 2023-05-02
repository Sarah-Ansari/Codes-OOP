package com.app.cust;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	private int price;

	private ServicePlan(int price) {
		this.price=price;
	}

	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return name()+"@"+price;
	}

}
