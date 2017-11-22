package com.demo.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.entity.User;
import com.demo.springboot.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getAll(){
		return userMapper.getAll();
	}

	public User getOne(long id) {
		return userMapper.getOne(id);
	}


}
