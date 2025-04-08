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
	public User loginUser(String userId, String password) {
		return dao.validateUser(userId, password);
	}

	//아이디 중복체크
	@Override
	public boolean checkId(String userId) {
		return dao.isUserExist(userId); //true면 중복됨. false면 해당 아이디로 회원가입 가능.
	}

	//회원가입
	@Override
	public boolean joinUser(User user) {
		if(dao.isUserExist(user.getUserId())) return false; 
		return dao.saveUser(user); //회원가입한 유저 정보 DB에 저장
	}

	//회원탈퇴
	@Override
	public boolean deleteUser(User user) {
		return dao.deleteUser(user); //유저 정보 DB에서 삭제
	}

}
