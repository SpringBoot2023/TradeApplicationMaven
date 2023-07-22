package com.example.spring.controllers;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Order;
import com.example.spring.model.TimeSession;
import com.example.spring.repository.TimeSessionRepo;
import com.example.spring.repository.TradeRepository;
import com.example.spring.service.OrderService;

@RestController
@RequestMapping(value="/api/auth")
public class TradeController {
	@Autowired
	private TradeRepository tradeRepository;
	
	OrderService orderService = new OrderService();

	@Autowired
	TimeSessionRepo timeSessionRepository;

	@PostMapping(value="/create/orders")
	public Order createOrder(@RequestBody Order order) {
		String tokenId = order.getTokenId();
		Timestamp currentTime = (Timestamp) new Date();
		List<TimeSession> timeObjList = timeSessionRepository.findByTokenId(tokenId);

		
		for(TimeSession timeSessionObj : timeObjList) {
			
		System.out.println("session no : "+timeSessionObj.getSessionId()+", token start time : "+timeSessionObj.getStartTime()+", token end time : "+timeSessionObj.getEndTime());
			if((timeSessionObj.getStartTime()).before(currentTime) && 
					(timeSessionObj.getEndTime()).after(currentTime) ) {
				order.setStatus("200");
				order.setRejectionreason("SUCCESS");
			}
			else {
				order.setStatus("8");
				order.setRejectionreason("REJECTED- TIME SESSION ENDED");
			}
			System.out.println("orderObj = "+order.toString());
			

		}
		return tradeRepository.save(order);

	}
	
	
}
