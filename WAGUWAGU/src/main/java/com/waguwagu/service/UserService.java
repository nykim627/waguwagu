package com.waguwagu.service;

import com.waguwagu.dto.User;

public interface UserService {
	
    //로그인
	User loginUser(String userId, String password);
	
	//회원가입
	boolean joinUser(User user);

}
