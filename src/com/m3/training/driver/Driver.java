package com.m3.training.driver;

import java.util.ArrayList;
import java.util.List;

import com.m3.training.trading.Book;
import com.m3.training.trading.BuyOrder;
import com.m3.training.trading.Exchange;
import com.m3.training.trading.SellOrder;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize
		Exchange exchange = new Exchange();
		Book bookStock1 = new Book("stock1");
		BuyOrder buyOrder1 = new BuyOrder("abcd",50,99);
		BuyOrder buyOrder2 = new BuyOrder("abcd",50,55);
		BuyOrder buyOrder3 = new BuyOrder("abcd", 49, 49);
		BuyOrder buyOrder4 = new BuyOrder("abcd", 24, 43);
		SellOrder sellOrder1 = new SellOrder("abcd",11,11);
		Book abcdBook = new Book("abcd");
		
		
		System.out.println("Ready To Trade!");
		bookStock1.addOrder(buyOrder1);
//		bookStock1.addOrder(sellOrder1);
//		System.out.println("driver-stock1 "+ bookStock1);

		//bookStock1.removeOrder(buyOrder1);
		//bookStock1.removeOrder(sellOrder1);
		//System.out.println(bookStock1);
		
//		List buysBook = new ArrayList<BuyOrder>();
//		List salesBook = new ArrayList<SellOrder>();
		abcdBook.add(sellOrder1);
		abcdBook.add(buyOrder2);
		abcdBook.add(buyOrder3);
		abcdBook.add(buyOrder4);
		abcdBook.add(sellOrder1);
		System.out.println(abcdBook);	
		exchange.checkOrders();
		exchange.processOrder();
		exchange.processOrder(sellOrder1, sellOrder1, abcdBook);
		
		System.out.println(abcdBook);

		
		abcdBook.remove(sellOrder1);
		

		
		
		
	    
		
	}
	


}
