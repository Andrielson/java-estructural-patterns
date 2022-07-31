package com.github.andrielson.bridge.backend;

import com.github.andrielson.bridge.backend.dao.UserMongoDao;
import com.github.andrielson.bridge.backend.dao.UserMysqlDao;
import com.github.andrielson.bridge.backend.dao.UserOracleDao;
import com.github.andrielson.bridge.backend.dao.UserPostgresDao;
import com.github.andrielson.bridge.backend.model.User;
import com.github.andrielson.bridge.backend.services.UserEJB;
import com.github.andrielson.bridge.backend.services.UserRest;
import com.github.andrielson.bridge.backend.services.UserService;
import com.github.andrielson.bridge.backend.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
