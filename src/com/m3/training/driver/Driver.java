package com.m3.training.driver;

import com.m3.training.trading.Book;
import com.m3.training.trading.BuyOrder;
import com.m3.training.trading.Exchange;
import com.m3.training.trading.SellOrder;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize
		Exchange exchange = new Exchange();
		Book stock1 = new Book("stock1");
		BuyOrder buyOrder1 = new BuyOrder("abcd",50,99.00);
		SellOrder sellOrder1 = new SellOrder("abcd",50,99.00);
		
		
		System.out.println("Ready To Trade!");
		stock1.addOrder(buyOrder1);
		stock1.addOrder(sellOrder1);
		exchange.checkOrders();
		exchange.processOrder();
		stock1.removeOrder(buyOrder1);
		stock1.removeOrder(sellOrder1);
		
	}

}
