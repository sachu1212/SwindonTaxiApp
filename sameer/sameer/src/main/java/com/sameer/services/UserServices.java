package com.sameer.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sameer.Repositories.UserRepository;
import com.sameer.models.User;

@Service
public class UserServices implements IUserServices {

	@Autowired
	private UserRepository userRepositiory;
	
	public List<User> getUser() {
		return userRepositiory.findAll();
	}

}
