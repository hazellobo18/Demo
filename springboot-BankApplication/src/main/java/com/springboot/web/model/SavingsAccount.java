package com.springboot.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class SavingsAccount {
	
	
	@Id
	@GeneratedValue
	private int id;
	private Long accountnumber;
	private Double accountbalance;
	
	
	public SavingsAccount(Long accountnumber, Double accountbalance) {
		super();
		this.accountnumber = accountnumber;
		this.accountbalance = accountbalance;
	}

	public SavingsAccount() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountbalance == null) ? 0 : accountbalance.hashCode());
		result = prime * result + ((accountnumber == null) ? 0 : accountnumber.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		if (accountbalance == null) {
			if (other.accountbalance != null)
				return false;
		} else if (!accountbalance.equals(other.accountbalance))
			return false;
		if (accountnumber == null) {
			if (other.accountnumber != null)
				return false;
		} else if (!accountnumber.equals(other.accountnumber))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public Double getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(Double accountbalance) {
		this.accountbalance = accountbalance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [id=" + id + ", accountnumber=" + accountnumber + ", accountbalance=" + accountbalance
				+ "]";
	}
	
	
	
	
}
