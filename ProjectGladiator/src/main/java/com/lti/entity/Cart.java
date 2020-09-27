package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Cart {

	@Column(name="cart_id")
	private int cartId;
	private int quantity;
	@Column(name="total_price")
	private double totalPrice;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private Customer customer;
	
	@OneToMany(mappedBy="cart")
	private List <Product> products;
	
	@OneToMany(mappedBy="cart")
	private List <Purchase> orders;
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Purchase> getOrders() {
		return orders;
	}
	public void setOrders(List<Purchase> orders) {
		this.orders = orders;
	}
	
	
}
