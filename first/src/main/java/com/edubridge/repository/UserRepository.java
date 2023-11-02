package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	

	

	
	User findByEmailAndPasword(String email, String pasword);

}
