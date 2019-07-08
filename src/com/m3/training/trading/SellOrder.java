package com.m3.training.trading;

import java.math.BigDecimal;

public class SellOrder extends Order {

	public SellOrder(String string, BigDecimal price, BigDecimal shares) {

		super(string, price, shares);
		type = "sell";
	}

}
