package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.model.PrimaryAccount;
import com.springboot.web.model.SavingsAccount;
import com.springboot.web.service.AccountService;
import com.springboot.web.service.RegisterService;

@RestController
public class Accounts {
	
	@Autowired
	RegisterService registerService;
	
	@Autowired
	AccountService accountService;
	
	
	@RequestMapping("/primary")
	@CrossOrigin(origins = "http://localhost:4200")
	public PrimaryAccount addPrimaryAccount()
	{
		PrimaryAccount Obj;
		Obj=accountService.createPrimaryAccount();
		return Obj;
	}
	
	@RequestMapping("/savings")
	@CrossOrigin(origins = "http://localhost:4200")
	public SavingsAccount addSavingsAccount()
	{
		SavingsAccount Obj;
		Obj=accountService.createSavingsAccount();
		return Obj;
	}
	
	
	
	
	
}
