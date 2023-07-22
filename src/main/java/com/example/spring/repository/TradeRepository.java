package com.example.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.spring.model.Order;
import com.example.spring.model.TimeSession;

public interface TradeRepository extends JpaRepository<Order, Long> {

	
}
