package com.edubridge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edubridge.entity.User;
import com.edubridge.service.UserService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/user")
public class UserCotroller {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user){
		User registerUser = userService.registerUser(user);
		return new ResponseEntity<>(registerUser,HttpStatus.ACCEPTED);	
	}
	
	@PostMapping("/login")
	public ResponseEntity<User> loginUser(@RequestBody User user){
		User loginUser = userService.loginUser(user);
		return new ResponseEntity<>(loginUser,HttpStatus.ACCEPTED);	
	}

}
