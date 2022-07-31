package com.github.andrielson.bridge.backend.dao;

import com.github.andrielson.bridge.backend.model.User;

public class UserOracleDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Oracle Database!");
	}
}
