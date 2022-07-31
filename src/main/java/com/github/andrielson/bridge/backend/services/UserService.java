package com.github.andrielson.bridge.backend.services;

import com.github.andrielson.bridge.backend.dao.UserDao;
import com.github.andrielson.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
