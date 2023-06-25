package com.example.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Order;
import com.example.spring.repository.TradeRepository;

@RestController
@RequestMapping(value="/api/auth")
public class TradeController {
	@Autowired
	private TradeRepository tradeRepository;

	@GetMapping(value="/find/all/orders")
	public List<Order> getAllOrders() {
		return tradeRepository.findAll();
	}
	@GetMapping(value="/registration")
	public String registerUser() {
		return "Hello World";
    }
	@PostMapping(value="/create/orders")
	public Order createOrder(@RequestBody Order order) {
		return tradeRepository.save(order);
	}
}