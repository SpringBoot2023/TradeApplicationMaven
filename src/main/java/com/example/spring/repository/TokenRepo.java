package com.example.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.spring.model.Token;

public interface TokenRepo extends JpaRepository<Token, String>{

	@Query("select t from Token t where t.tokenid = :tokenId")
	Token findByTokenId(@Param(value="tokenId") String tokenId);
}
