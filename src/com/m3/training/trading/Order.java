package com.m3.training.trading;

import java.math.BigDecimal;

import com.m3.training.interfaces.IOrder;

public abstract class Order implements IOrder, Comparable<Order> {
	private String id;
	private String symbol;
	private BigDecimal price;
	private BigDecimal shares;
	protected String type;


	public Order (String symbol, BigDecimal price, BigDecimal shares) {
		id = "id";
		this.symbol = symbol;
		this.price = price;
		this.shares = shares;
//		return Order(shares, shares, shares);
		
	}
	@Override
	public String toString() {
		return String.format("{%s-%s @ $%s, %s shares}", type, symbol, price, shares);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getShares() {
		return shares;
	}
	public void setShares(BigDecimal shares) {
		this.shares = shares;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int compareTo(Order order) {
		return(this.getPrice().compareTo(order.getPrice()));
	}
	
//	public int compareToSize(Order order) {
//		return(this.getShares().compareTo(order.getShares()));
//	}

}
