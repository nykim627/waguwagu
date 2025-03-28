package com.waguwagu.dao;

import com.waguwagu.dto.User;

public class UserDaoImpl implements UserDao {
	//singleton
	private UserDaoImpl() {};
	private static UserDao dao = new UserDaoImpl();
	public static UserDao getInstance() {
		return dao;
	}

	@Override
	public boolean insertUser(User user) {
		return false;
	}

	@Override
	public boolean isUserExist(String userId) {
		return false;
	}

	@Override
	public boolean saveUser(User user) {
		return false;
	}

	@Override
	public User validateUser(String userId, String password) {
		return null;
	}

	@Override
	public boolean deleteUser(String userId) {
		return false;
	}

}
