package com.m3.training.trading;

import java.util.ArrayList;
import java.util.List;

import com.m3.training.interfaces.IBook;

public class Book extends ArrayList implements IBook{
	// Stores orders
	String name;
	Order order;
	
	
	//constructor
	private List<Order> book = new ArrayList<>();

	public Book(String name){
		this.name = name;
	}
	
	

	


	public void addOrder(Order order) {
		book.add(order);
		
	}

	public void removeOrder(Book book, Order order) {
		book.remove(order);
		
	}

	public int getMaximumSize() {
		// TODO Auto-generated method stub
		
		return 0;
	}

	public int getMinimumSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getMinimumPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getMaximumPrice() {
		// TODO Auto-generated method stub
		return 0;
	}






	@Override
	public void removeOrder(Order order) {
		// TODO Auto-generated method stub
		
	}
	
	

}
