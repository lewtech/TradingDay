package com.m3.training.trading;

public class SellOrder extends Order {

	public SellOrder(String string, int i, int d) {
		// TODO Auto-generated constructor stub
		super(string, d, i);
		type = "sell";
	}

}
