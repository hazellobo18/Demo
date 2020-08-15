package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PrimaryAccountDao;
import com.dao.SavingsAccountDao;
import com.springboot.web.model.PrimaryAccount;
import com.springboot.web.model.SavingsAccount;

@Service
public class AccountService {

	private static Long accountNumber =  (long) 12345431;
	
	@Autowired
	PrimaryAccountDao primaryAccountDao;
	
	@Autowired
	SavingsAccountDao savingsAccountDao;
	
	public PrimaryAccount createPrimaryAccount()
	{
		PrimaryAccount primaryAccount = new PrimaryAccount();
		primaryAccount.setAccountNumber(Nextaccount());
		primaryAccount.setAccountbalance(0.0);
		
		primaryAccountDao.save(primaryAccount);
		
		return primaryAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
	}
	
	
	public SavingsAccount createSavingsAccount()
	{
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setAccountnumber(Nextaccount());
		savingsAccount.setAccountbalance(0.0);
		
		savingsAccountDao.save(savingsAccount);
		
		return savingsAccountDao.findByAccountnumber(savingsAccount.getAccountnumber());
	}
	
	
	public void deposit()
	{
		
	}
	
	
	
	
	private Long Nextaccount()
	{
		return ++accountNumber;
	}
}
