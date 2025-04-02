package com.waguwagu.service;

import com.waguwagu.dao.UserDao;
import com.waguwagu.dao.UserDaoImpl;
import com.waguwagu.dto.User;

public class UserServiceImpl implements UserService {
	//singleton
	private UserServiceImpl() {};
	private static UserService service = new UserServiceImpl();
	public static UserService getInstance() {
		return service;
	}
	
	//dao 가져오기
	private UserDao dao = UserDaoImpl.getInstance();

	//로그인
	@Override
	public boolean loginUser(String userId, String password) {
		if(dao.validateUser(userId, password) == null) {
			return false;
		}
		return true;
	}

	//회원가입
	@Override
	public boolean joinUser(User user) {
		return false;
	}

}
