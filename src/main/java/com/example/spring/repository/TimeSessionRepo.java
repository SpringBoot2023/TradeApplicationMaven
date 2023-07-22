package com.example.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.spring.model.TimeSession;

@Repository
public interface TimeSessionRepo extends JpaRepository<TimeSession, String>{
	
	@Query("select ts from TimeSession ts where ts.tokenId =:")
	 List<TimeSession> findByTokenId(@Param(value="token") String tokenId);
	
	}
