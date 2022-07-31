package com.github.andrielson.adapter.hexagonal.core.ports;

import java.util.List;

import com.github.andrielson.adapter.hexagonal.core.model.User;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
