package com.example.spring.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class TokenCreationService {

	public String createToken(String productCode) {
		String tokenId = "";
		Date sysDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		String date = formatter.format(sysDate);
		
		tokenId = date+productCode;
		
		System.out.println("token id = "+tokenId);
		return tokenId;
	}
}
