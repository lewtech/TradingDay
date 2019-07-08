package com.m3.training.trading;

import java.math.BigDecimal;

public class BuyOrder extends Order{

	public BuyOrder(String name, BigDecimal price, BigDecimal shares ) {

		super(name, price, shares);
		type = "buy";
	}

}
