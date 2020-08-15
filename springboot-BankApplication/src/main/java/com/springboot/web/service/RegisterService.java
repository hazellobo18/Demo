package com.springboot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.dao.PrimaryAccountDao;
import com.dao.SavingsAccountDao;
import com.springboot.web.model.User;

@Service
public class RegisterService {
	
	@Autowired
	MyRepo repo;
	
	@Autowired
	PrimaryAccountDao primaryAccountDao;
	
	@Autowired
	SavingsAccountDao savingsAccountDao;
	
	@Autowired
	AccountService accountService;
	
	
	
	
	public User saveaddUser(User user)
	{
	
		user.setPrimaryAccount(accountService.createPrimaryAccount());
		user.setSavingsAccount(accountService.createSavingsAccount());
		return repo.save(user);
	}
	

	
	public User matchEmailPassword(String mailid, String password)
	{
		return repo.findByMailidAndPassword(mailid, password);
	}
	
//	public User viewpage(String mailid)
//	{
//		return repo.findByMailid(mailid);
//	}



//	public List<User> getUserDetails() {
//		return repo.findAll();
//	}
//
//
//
//	public List<User> getUserbyemail(String mailid) {
//		return repo.findByMailid(mailid);
//	}
}
