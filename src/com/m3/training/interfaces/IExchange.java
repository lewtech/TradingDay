package com.m3.training.interfaces;

import com.m3.training.trading.Book;
import com.m3.training.trading.Order;

public interface IExchange {
	public void processOrder(Order buyOrder, Order sellOrder, Book book); 

	void checkOrders();

	void processOrder();
	
}
