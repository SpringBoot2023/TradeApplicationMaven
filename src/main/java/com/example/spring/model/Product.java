package com.example.spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	private String category;
	private String productCode;
	private int minPrice;
	private int maxPrice;
	private int minQty;
	private int maxQty;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productNo;

	
	
	public Product() {
		
		// TODO Auto-generated constructor stub
	}

	public Product(String category, String productCode, int minPrice, int maxPrice, int minQty, int maxQty, int productNo) {
		super();
		this.category = category;
		this.productCode = productCode;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.minQty = minQty;
		this.maxQty = maxQty;
		this.productNo = productNo;
	}

	@Column(name="product_no")
	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}


	@Column(name="product_code")
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Column(name="category")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Column(name="min_price")
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	@Column(name="max_price")
	public int getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
	@Column(name="min_qty")
	public int getMinQty() {
		return minQty;
	}
	public void setMinQty(int minQty) {
		this.minQty = minQty;
	}
	@Column(name="max_qty")
	public int getMaxQty() {
		return maxQty;
	}
	public void setMaxQty(int maxQty) {
		this.maxQty = maxQty;
	}
	@Override
	public String toString() {
		return "Product [category=" + category + ", productCode=" + productCode + ", minPrice=" + minPrice + ", maxPrice="
				+ maxPrice + ", minQty=" + minQty + ", maxQty=" + maxQty + "]";
	}
	
}
