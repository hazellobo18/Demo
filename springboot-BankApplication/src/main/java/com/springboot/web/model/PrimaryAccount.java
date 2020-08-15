package com.springboot.web.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class PrimaryAccount {
	
	@Id
	@GeneratedValue
	private int id;
	private Long accountNumber;
	private Double accountbalance;
	
	
//	@OneToMany(mappedBy = "primaryAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JsonIgnore
//    private List<PrimaryTransaction> primaryTransactionList;
//	
//	
//	public List<PrimaryTransaction> getPrimaryTransactionList() {
//		return primaryTransactionList;
//	}


//	public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
//		this.primaryTransactionList = primaryTransactionList;
//	}


	public PrimaryAccount() {
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(Double accountbalance) {
		this.accountbalance = accountbalance;
	}
	
	
}
