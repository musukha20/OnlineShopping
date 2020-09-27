package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {
	
	@Id
	@Column(name="stock_id")
	private int stockId;
	private int quantity;
	private double price;
	
	
	@ManyToOne
	@JoinColumn(name="retailer_id")
	private Retailer retailer;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Categorization category;
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Retailer getRetailer() {
		return retailer;
	}
	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}
	public Categorization getCategory() {
		return category;
	}
	public void setCategory(Categorization category) {
		this.category = category;
	}
	

}
