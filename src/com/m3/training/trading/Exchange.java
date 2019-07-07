package com.m3.training.trading;

import com.m3.training.interfaces.IExchange;

public class Exchange  {

	public void checkOrders() {
		// TODO Auto-generated method stub
		
	}

	public void processOrder(Order buyOrder, Order sellOrder, Book book) {
		book.removeOrder(book, buyOrder);
		book.removeOrder(book, sellOrder);
		
	}

	public void processOrder() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return String.format("{test }");
	}
	


}
