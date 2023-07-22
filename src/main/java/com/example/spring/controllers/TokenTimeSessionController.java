package com.example.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Product;
import com.example.spring.model.TimeSession;
import com.example.spring.model.Token;
import com.example.spring.repository.ProductRepo;
import com.example.spring.repository.TimeSessionRepo;
import com.example.spring.repository.TokenRepo;
import com.example.spring.service.TokenCreationService;

@RestController
@RequestMapping(value="/token")
public class TokenTimeSessionController {
	
	@Autowired
	TokenCreationService tokenCreationService;
	
	@Autowired
	TimeSessionRepo timeSesssionRepository;
	
	@Autowired
	TokenRepo tokenRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	//This method creates token's start time and end time for each session ids. 
	//Note: this method is tested through postman
	@PostMapping(value = "/timeSessions")
	public TimeSession createTimeSession(@RequestBody TimeSession timeSession) {
		
		System.out.println("timeSession Obj = "+timeSession.toString());
		return timeSesssionRepository.save(timeSession);
		
	}
	
	//This method creates token for trading 
	//Note: this method is tested.
	@PostMapping(value="/createToken")
	public ResponseEntity<String> createToken(@RequestBody Token token) {
		
		String productCode = token.getProduct();
		System.out.println("productCode = "+productCode);
		ResponseEntity<String> response = null;
		
		Product productObj =  (Product) productRepo.findByProduct(productCode);
		
		
		if(productObj !=null && productObj.getProductCode().equals(productCode)) {
			System.out.println("productCode from db = "+productObj.getProductCode());
			
				String tokenIdCreated = tokenCreationService.createToken(productCode);
				Token tokenObj = (Token) tokenRepo.findByTokenId(tokenIdCreated);
				
				
				if(tokenObj != null && tokenObj.getTokenid().equals(tokenIdCreated)) {
					System.out.println("token id from db = "+tokenObj.getTokenid());
					response =  ResponseEntity.ok("Token already exists");
				
			}
			else {
				token.setTokenid(tokenIdCreated);
				tokenRepo.save(token);
				response =  ResponseEntity.ok("Token created successfully");
			}
		}
		else {
			response =  ResponseEntity.ok("Product does not exists");
		}
		
		return response;
		
	}
	
	//This method creates product codes under a particular product category in database table 'product'
	//Note : This method is tested using postman, working properly
	@PostMapping(value="/createProduct")
	public ResponseEntity<String> createProduct(@RequestBody Product product) {
		System.out.println("product Obj = "+product);
		String prodCode = product.getProductCode();
		Product prodObj = (Product) productRepo.findByProduct(prodCode);
		if(prodObj != null && prodObj.getProductCode().equals(prodCode)) {
			System.out.println("Inside if loop");
			return ResponseEntity.ok("Product already exists");
		}
		
	
		productRepo.save(product);
		return ResponseEntity.ok("Product Created Successfully");
	
	
	}
}
