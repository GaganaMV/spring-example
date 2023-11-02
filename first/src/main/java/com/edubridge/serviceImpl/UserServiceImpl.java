package com.edubridge.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.entity.User;
import com.edubridge.repository.UserRepository;
import com.edubridge.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		return userRepository.save(user);
		
	}

	@Override
	public User loginUser(User user) {
		User userLogin = userRepository.findByEmailAndPasword(user.getEmail(),user.getPasword());
		return userLogin;
	}

}
