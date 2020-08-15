package com.springboot.web.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	

//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;


	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//private Long id;
	
	
	private String fullname;
	private String surname;
	
	//@Column(name = "mailid", unique = true)
	
	@Id
	private String mailid;
	private Long phonenumber;
	private String address;
	private String password;
	private String status;
	
//	@GeneratedValue
//	private int primary_id;
//
//	@GeneratedValue
//	private int savings_id;
	
	@OneToOne
	private PrimaryAccount primaryAccount;
	
	@OneToOne
	private SavingsAccount savingsAccount;
	
	
	//@OneToMany(fetch = FetchType.LAZY)
	//private Cheque cheque;
	
	//, cascade = CascadeType.ALL, fetch = FetchType.LAZY
//	@OneToMany(targetEntity = Chequebook.class, cascade = CascadeType.ALL)
//	@JoinColumn(name="cb-fk", referencedColumnName = "id")
	
	
	
//	@OneToMany(fetch = FetchType.LAZY)
//	private List<Chequebook> ChequeBookList;
	

	public User(Long id, String fullname, String surname, String mailid, Long phonenumber, String address,
			String password, String status, PrimaryAccount primaryAccount, SavingsAccount savingsAccount)
//			List<Chequebook> chequeBookList) {
		{//this.id = id;
		this.fullname = fullname;
		this.surname = surname;
		this.mailid = mailid;
		this.phonenumber = phonenumber;
		this.address = address;
		this.password = password;
		this.status = status;
		this.primaryAccount = primaryAccount;
		this.savingsAccount = savingsAccount;
		
	//	chequeBookList = chequeBookList;
	}




	public User()
	{
		
	}

	
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

//	public Long getId() {
//		return id;
//	}
//
//
//	public void setId(Long id) {
//		this.id = id;
//	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getMailid() {
		return mailid;
	}


	public void setMailid(String mailid) {
		this.mailid = mailid;
	}


	public Long getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public PrimaryAccount getPrimaryAccount() {
		return primaryAccount;
	}


	public void setPrimaryAccount(PrimaryAccount primaryAccount) {
		this.primaryAccount = primaryAccount;
	}


	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}


	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

//	public List<Chequebook> getChequeBookList() {
//		return ChequeBookList;
//	}
//
//	public void setChequeBookList(List<Chequebook> chequeBookList) {
//		ChequeBookList = chequeBookList;
//	}
		
}
