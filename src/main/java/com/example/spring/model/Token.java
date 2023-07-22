package com.example.spring.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tokens")
public class Token {

	private String tokenid;
	private String product;
	private String createdby;
	private Timestamp createdtime;
	public Token(String tokenid, String product, String createdby, Timestamp createdtime) {
		super();
		this.tokenid = tokenid;
		this.product = product;
		this.createdby = createdby;
		this.createdtime = createdtime;
	}
	
	
	public Token() {
		
		// TODO Auto-generated constructor stub
	}


	@Id
	@Column(name="tokenid")
	public String getTokenid() {
		return tokenid;
	}
	public void setTokenid(String tokenid) {
		this.tokenid = tokenid;
	}
	@Column(name="product")
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	@Column(name="createdby")
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	@Column(name="createdtime")
	public Timestamp getCreatedtime() {
		return createdtime;
	}
	public void setCreatedtime(Timestamp createdtime) {
		this.createdtime = createdtime;
	}


	@Override
	public String toString() {
		return "Token [tokenid=" + tokenid + ", product=" + product + ", createdby=" + createdby + ", createdtime="
				+ createdtime + "]";
	}
	
	
	
}
