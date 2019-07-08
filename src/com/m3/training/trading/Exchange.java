package com.m3.training.trading;

import java.util.ArrayList;
import java.util.List;

import com.m3.training.interfaces.IExchange;

public class Exchange implements IExchange {

	public void checkOrders()  {

		
	}
	
	private List<Book> books = new ArrayList<>();
	
	public void scanOrders(Book book) {
		int sellIndex = 0;
		int buyIndex = 0;
		while (sellIndex < book.getSize() && buyIndex < book.getSize() ) {
			
		}
		
	}

	public void processOrder(Order buyOrder, Order sellOrder, Book stockBook, Book tradeBook ) {
		stockBook.removeOrder(buyOrder);
		stockBook.removeOrder(sellOrder);
		
	}
	
	public void addBook(Book book) {
		books.add(book);
	}


	
	@Override
	public String toString() {
		return String.format("{%s}", books);
	}

	@Override
	public void processOrder(Order buyOrder, Order sellOrder, Book book) {
		// TODO Auto-generated method stub
		
	}
	


}
