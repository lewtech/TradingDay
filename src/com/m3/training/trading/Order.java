package com.m3.training.trading;

import com.m3.training.interfaces.IOrder;

public abstract class Order implements IOrder {
	private String id;
	private String symbol;
	private int price;
	private int shares;
	protected String type;


	public Order (String symbol, int price, int shares) {
		id = "id";
		this.symbol = symbol;
		this.price = price;
		this.shares = shares;
//		return Order(shares, shares, shares);
		
	}
	
	public String toString() {
		return String.format("{%s-%s @ $%s, %s shares}", type, symbol, price, shares);
	}

}
