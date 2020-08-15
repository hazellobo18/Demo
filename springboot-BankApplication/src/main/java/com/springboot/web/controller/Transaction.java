package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.web.service.TransactionService;

public class Transaction {

	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private Registration registration;
	
}
