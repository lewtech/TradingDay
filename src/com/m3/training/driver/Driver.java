package com.m3.training.driver;

import java.math.BigDecimal;

import com.m3.training.trading.Book;
import com.m3.training.trading.BuyOrder;
import com.m3.training.trading.Exchange;
import com.m3.training.trading.SellOrder;


public class Driver {

	public static void main(String[] args) {

		
		//initialize
		Exchange exchange = new Exchange();
		Book bookStock1 = new Book("stock1");
		BuyOrder buyOrder1 = new BuyOrder("abcd", new BigDecimal("99.99"), new BigDecimal("50.00"));
		BuyOrder buyOrder2 = new BuyOrder("abcd", new BigDecimal("1.99"), new BigDecimal("10.00"));
		BuyOrder buyOrder3 = new BuyOrder("abcd", new BigDecimal("2.99"), new BigDecimal("20.00"));
		BuyOrder buyOrder4 = new BuyOrder("abcd", new BigDecimal("89.99"), new BigDecimal("30.00"));
		SellOrder sellOrder1 = new SellOrder("abcd", new BigDecimal("99.99"), new BigDecimal("30.00"));
		Book abcdBook = new Book("abcd");
		Book efghBook = new Book("efgh");
		Book tradesBook = new Book("trades");
		Book ijklBook = new Book("ijkl");
		exchange.addBook(abcdBook);
		exchange.addBook(efghBook);
		exchange.addBook(ijklBook);
	
		
		
		System.out.println("Ready To Trade!");
		bookStock1.addOrder(buyOrder1);

		abcdBook.addOrder(sellOrder1);
		abcdBook.addOrder(sellOrder1);
		abcdBook.addOrder(buyOrder2);
		abcdBook.addOrder(buyOrder3);
		abcdBook.addOrder(buyOrder4);
		abcdBook.addOrder(sellOrder1);
		System.out.println(abcdBook);	
//		exchange.checkOrders();
//		exchange.processOrder(sellOrder1, sellOrder1, abcdBook);
		
		System.out.println(abcdBook);

		

		
		System.out.println("minimum price " + abcdBook.getMinimumPrice());
		System.out.println("maximum price " + abcdBook.getMaximumPrice());
		System.out.println("minimum size " + abcdBook.getMinimumSize());
		System.out.println("maximum size " + abcdBook.getMaximumSize());
		System.out.println("\nexchange " + exchange);

		
		
		
	    
		
	}
	


}
