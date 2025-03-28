package com.waguwagu.service;

import com.waguwagu.dao.UserDao;
import com.waguwagu.dao.UserDaoImpl;
import com.waguwagu.dto.User;

public class UserServiceImpl implements UserService {
	//singleton
	private UserServiceImpl() {};
	private UserService service = new UserServiceImpl();
	public UserService getInstance() {
		return service;
	}
	
	//dao 가져오기
	private UserDao dao = UserDaoImpl.getInstance();

	@Override
	public boolean loginUser(String userId, String password) {
		return false;
	}

	@Override
	public boolean joinUser(User user) {
		return false;
	}

}
