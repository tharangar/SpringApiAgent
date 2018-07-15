package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.User;



public interface UserService {
	
	User findById(int id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	public boolean isUserExist(User user);
	
}
