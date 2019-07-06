package com.m3.training.trading;

import com.m3.training.interfaces.IBook;

public class Book implements IBook {
	// STORES ORDERS
	String name;
	
	public Book(String name){
		this.name = name;
	}
    void addORder() {
	}
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeOrder(Order order) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getMaximumSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getMinimumSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getMinimumPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getMaximumPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
