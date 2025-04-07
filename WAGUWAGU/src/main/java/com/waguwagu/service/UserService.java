package com.waguwagu.service;

import com.waguwagu.dto.User;

public interface UserService {
	
    //로그인
	User loginUser(String userId, String password);
	
	//아이디 중복 확인
	boolean checkId(String userId);
	
	//회원가입
	boolean joinUser(User user);
	
	//회원탈퇴
	boolean deleteUser(User user);

}
