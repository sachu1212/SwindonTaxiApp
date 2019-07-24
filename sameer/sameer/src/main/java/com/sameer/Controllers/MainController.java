package com.sameer.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sameer.Repositories.UserRepository;
import com.sameer.models.User;

@RestController
public class MainController {
	
	@Autowired
	UserRepository userrepo;
	
	@RequestMapping(value="/users")
	public ResponseEntity<List<User>> showUsers() {
		return ResponseEntity.ok( userrepo.findAll());
	}

	@RequestMapping(value="/CreateUser", method=RequestMethod.POST)
	public ResponseEntity<User> createuser(User user) {
		userrepo.saveAndFlush(user);
		return ResponseEntity.ok( user);
	}
	

	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<List<User>> loginuser(User user) {
		return ResponseEntity.ok( userrepo.searchuser("shafeeq","abc"));
	}
}
