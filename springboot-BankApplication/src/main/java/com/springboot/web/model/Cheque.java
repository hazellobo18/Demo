package com.springboot.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cheque {
	@Id
	@GeneratedValue
	private int cid;
	private String description;
	private String request ="pending";
	
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="mailid",nullable=false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JsonIgnore
	private User user;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Cheque [cid=" + cid + ", description=" + description + ", request=" + request + ", user=" + user + "]";
	}
	public Cheque() {
		
		// TODO Auto-generated constructor stub
	}
	public Cheque(int cid, String description, String request, User user) {
		super();
		this.cid = cid;
		this.description = description;
		this.request = request;
		this.user = user;
	}
	
	
	
	
	
	
	
}
