package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.model.PrimaryAccount;

public interface PrimaryAccountDao  extends JpaRepository< PrimaryAccount,Integer>{
	PrimaryAccount findByAccountNumber(Long accountNumber);

}
