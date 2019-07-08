package com.m3.training.interfaces;

import com.m3.training.trading.Book;
import com.m3.training.trading.Order;

public interface IBook {

	void removeOrder(Order order);
	Order getMaximumSize();
	Order getMinimumSize();
	Order getMinimumPrice();
	Order getMaximumPrice();
	void addOrder(Order order);
	int compare(Book o1, Book o2);
	int compareTo(Order o);

}
