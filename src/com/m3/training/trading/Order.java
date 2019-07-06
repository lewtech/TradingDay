package com.m3.training.trading;

import com.m3.training.interfaces.IOrder;

public abstract class Order implements IOrder {
	private String symbol;
	private Double price;
	private int shares;
	protected String type;

	public void Order (String symbol, Double price, int shares) {
		this.symbol = symbol;
		this.price = price;
		this.shares = shares;
	}

}
