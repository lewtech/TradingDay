package com.m3.training.interfaces;

import com.m3.training.trading.BuyOrder;
import com.m3.training.trading.Order;

public interface IBook {

	int getMaximumSize();
	int getMinimumSize();
	double getMinimumPrice();
	double getMaximumPrice();
	void addOrder(Order order);
	void removeOrder(Order order);
}
