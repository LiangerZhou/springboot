package com.demo.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.entity.User;
import com.demo.springboot.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getUsers")  //same as @RequestMapping(method={GET})
	public List<User> getUsers() {
		List<User> users = userService.getAll();
		return users;
	}
	
	
	@GetMapping("/getUser")
	public User getUser(long id) {
		User user = userService.getOne(id);
		return user;
	}
}
