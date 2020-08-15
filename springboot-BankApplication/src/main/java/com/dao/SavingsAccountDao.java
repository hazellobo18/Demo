package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.model.SavingsAccount;

public interface SavingsAccountDao extends JpaRepository<SavingsAccount, Integer>{
		SavingsAccount findByAccountnumber(Long accountnumber);
}
