package com.example.spring.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tokentimesessions")
public class TimeSession {

	private String tokenId;
	private Timestamp endTime;
	private Timestamp startTime;
	private int sessionId;
	public TimeSession(String tokenId, Timestamp endTime, Timestamp startTime, int sessionId) {
		super();
		this.tokenId = tokenId;
		this.endTime = endTime;
		this.startTime = startTime;
		this.sessionId = sessionId;
	}
	
	public TimeSession() {
		
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="sessionid")
	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	@Column(name = "tokenid")
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	
	@Column(name = "endtime")
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	
	@Column(name = "starttime")
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	@Override
	public String toString() {
		return "TimeSession [tokenId=" + tokenId + ", endTime=" + endTime + ", startTime=" + startTime + ", sessionId="
				+ sessionId + "]";
	}
	
	
}
