package com.springboot.web.controller;



	
import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

//import com.dao.ChequeBookDao;

import com.dao.MyRepo;
import com.springboot.web.model.Cheque;
//import com.springboot.web.model.Chequebook;
import com.springboot.web.model.User;

	@RestController
	public class AdminController {
		@Autowired
		MyRepo repo;
	
	
		
		@RequestMapping("/viewusers")
		@CrossOrigin(origins = "http://localhost:4200")
		public List<User> viewusers(){
			return repo.findAll();
			
		}
		
//		//view checkbook requests
//		@RequestMapping("/viewrequests")
//		//@CrossOrigin(origins = "http://localhost:4200")
//		public List<Cheque> viewrequest(){
//			return cheq.findAll();
//			
//		}
//		
//		//change chequebk status
//		@RequestMapping("status/${id}")
//		//@CrossOrigin(origins = "http://localhost:4200")
//	    public ResponseEntity<Cheque> changestatus(@PathVariable(value = "id") int id)  {
//	        Cheque c= cheq.findById(id);
//	        c.setRequest("Accepted");
//	      	System.out.println(c.getRequest());
//	      	Cheque updatedcheque= cheq.save(c);
//	        return ResponseEntity.ok(updatedcheque);
//	    }
//
		
		
		
		@GetMapping("/viewpage/{mailid}")
		@CrossOrigin(origins = "http://localhost:4200")
		public User getUser(@PathVariable(value = "mailid") String mailid) {
			User user = repo.findByMailid(mailid);
			return user;
		}
		
		
		@PutMapping("/lockuser/{mailid}")
		@CrossOrigin(origins = "http://localhost:4200")
	    public ResponseEntity<User> lockuser(@PathVariable(value = "mailid") String mailid)  {
			System.out.println("1");
	        User user = repo.findByMailid(mailid);
	      //  System.out.println("0");
	        user.setStatus("Blocked");
	        //System.out.println("12");
	        System.out.println(user.getStatus());
	        User updateduser = repo.save(user);
	        return ResponseEntity.ok(updateduser);
	    }

	}
