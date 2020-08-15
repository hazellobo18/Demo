package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.model.User;
import com.springboot.web.service.RegisterService;


@RestController
public class ViewProfileController {
	@Autowired
	RegisterService registerService;
	
	
//	@RequestMapping("/viewpage")
//	public User viewprofile(@RequestBody User user)
//	{
//		String temperorymail = user.getMailid();
//		return registerService.viewpage(temperorymail);
//	}
}
