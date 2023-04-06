package com.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.entity.User;
import com.users.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/{userId}")
	
	public User getUser(@PathVariable("userId")Long userId)
	{
		return this.userService.getUser(userId) ;
		
	}

}
