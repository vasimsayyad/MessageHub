package com.messagingapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.messagingapp.dao.UserDao;
import com.messagingapp.domain.User;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public int add(User user) {
		return userDao.add(user);
	}
	

}
