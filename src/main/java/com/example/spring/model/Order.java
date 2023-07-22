package com.example.spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	private long id;
	private String orderId;
	private String tokenId;
	private double price;
	private double quantity;
	private String tradingAccountId;
	private String tradingMemberId;
	private String unitCode;
	private String orderNature;
	private String status;
	private String rejectionreason;
	
	public Order() {
		
	}
	
	public Order(String orderId, String tokenId, double price, double quantity, String tradingAccountId,
			String tradingMemberId, String unitCode, String orderNature, String status, String rejectionreason) {
		super();
		this.orderId = orderId;
		this.tokenId = tokenId;
		this.price = price;
		this.quantity = quantity;
		this.tradingAccountId = tradingAccountId;
		this.tradingMemberId = tradingMemberId;
		this.unitCode = unitCode;
		this.orderNature = orderNature;
		this.status = status;
		this.rejectionreason = rejectionreason;
	}
	

	@Id
	@Column(name = "id", nullable = false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "orderId", nullable = false)
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	@Column(name = "tokenId", nullable = false)
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	@Column(name = "price")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Column(name = "quantity")
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Column(name = "tradingAccountId", nullable = false)
	public String getTradingAccountId() {
		return tradingAccountId;
	}
	public void setTradingAccountId(String tradingAccountId) {
		this.tradingAccountId = tradingAccountId;
	}
	@Column(name = "tradingMemberId")
	public String getTradingMemberId() {
		return tradingMemberId;
	}
	public void setTradingMemberId(String tradingMemberId) {
		this.tradingMemberId = tradingMemberId;
	}
	@Column(name = "unitCode")
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	@Column(name = "orderNature")
	public String getOrderNature() {
		return orderNature;
	}
	public void setOrderNature(String orderNature) {
		this.orderNature = orderNature;
	}

	@Column(name = "rejectionreason")
	public String getRejectionreason() {
		return rejectionreason;
	}

	public void setRejectionreason(String rejectionreason) {
		this.rejectionreason = rejectionreason;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", tokenId=" + tokenId + ", price=" + price + ", quantity="
				+ quantity + ", tradingAccountId=" + tradingAccountId + ", tradingMemberId=" + tradingMemberId
				+ ", unitCode=" + unitCode + ", orderNature=" + orderNature + ", status=" + status + "]";
	}

}
