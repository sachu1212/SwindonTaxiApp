package com.sameer.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sameer.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{

	
	 @Query("SELECT a FROM User a WHERE username = ?1 AND userpassword = ?2")
	    List<User> searchuser(String username, String userpassword);
}
