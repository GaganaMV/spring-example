package com.edubridge.service;

import com.edubridge.entity.User;

public interface UserService {

	User registerUser(User user);

	User loginUser(User user);

}
