package com.example.spring.model;

public class Order {

	private String orderId;
	private String tokenId;
	private double price;
	private double quantity;
	private String tradingAccountId;
	private String tradingMemberId;
	private String unitCode;
	private String orderNature;
	

	
	public Order(String orderId, String tokenId, double price, double quantity, String tradingAccountId,
			String tradingMemberId, String unitCode, String orderNature) {
		super();
		this.orderId = orderId;
		this.tokenId = tokenId;
		this.price = price;
		this.quantity = quantity;
		this.tradingAccountId = tradingAccountId;
		this.tradingMemberId = tradingMemberId;
		this.unitCode = unitCode;
		this.orderNature = orderNature;
	}
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getTradingAccountId() {
		return tradingAccountId;
	}
	public void setTradingAccountId(String tradingAccountId) {
		this.tradingAccountId = tradingAccountId;
	}
	public String getTradingMemberId() {
		return tradingMemberId;
	}
	public void setTradingMemberId(String tradingMemberId) {
		this.tradingMemberId = tradingMemberId;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getOrderNature() {
		return orderNature;
	}
	public void setOrderNature(String orderNature) {
		this.orderNature = orderNature;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", tokenId=" + tokenId + ", price=" + price + ", quantity=" + quantity
				+ ", tradingAccountId=" + tradingAccountId + ", tradingMemberId=" + tradingMemberId + ", unitCode="
				+ unitCode + ", orderNature=" + orderNature + "]";
	}
	
	
	
}
