package com.m3.training.trading;

public class BuyOrder extends Order{

	public BuyOrder(String name, int shares, int price) {
		// TODO Auto-generated constructor stub
		super(name, shares, price);
		type = "buy";
	}

}
