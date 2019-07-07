package com.m3.training.interfaces;

import com.m3.training.trading.Order;

public interface IBook {

	void removeOrder(Order order);
	int getMaximumSize();
	int getMinimumSize();
	double getMinimumPrice();
	double getMaximumPrice();
	void addOrder(Order order);

}
