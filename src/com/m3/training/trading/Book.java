package com.m3.training.trading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.m3.training.interfaces.IBook;

public class Book implements IBook{
	// Stores orders
	String name;
	Order order;
	
	
	private List<Order> book = new ArrayList<>();

	
	public Book(String name){
		this.name = name;
	}
	
	
	public void sort() {
		Collections.sort(book);
	}
	
	
	public void sortSize() {
		Collections.sort(book, sizeComparator );
	}
	
	public int getSize() {
		return book.size();
	}


	@Override
	public void addOrder(Order order) {
		book.add(order);
	}

	
	@Override
	public Order getMinimumSize() {
		// TODO Auto-generated method stub
	
		sortSize();
		return book.get(0);
	}

	@Override
	public Order getMaximumSize() {
		// TODO Auto-generated method stub
		sortSize();
		return book.get(book.size()-1);
	}



	@Override
	public Order getMinimumPrice() {
		sort();
		return book.get(0);
	}

	@Override
	public Order getMaximumPrice() {
		sort();
		return book.get(book.size()-1);
	}


	@Override
	public void removeOrder(Order order) {
		book.remove(order);
	}

	@Override
	public String toString() {
		return String.format("{%s}", book);
	}


	@Override
	public int compare(Book o1, Book o2) {
		return 0;
	}


	@Override
	public int compareTo(Order o) {
		return 0;
	}
	
	
    Comparator<Order> sizeComparator = new Comparator<Order>() {
        @Override
        public int compare(Order e1, Order e2) {
            return e1.getShares().compareTo(e2.getShares());
        }
    };
}
