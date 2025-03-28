package com.waguwagu.dao;

import com.waguwagu.dto.User;

public interface UserDao {
	
	//사용자 생성(회원가입)
	abstract boolean insertUser(User user);
	
    //사용자 존재 여부 확인
    abstract boolean isUserExist(String userId);

    //사용자 정보를 데이터베이스에 저장
    abstract boolean saveUser(User user);

    //사용자 인증(로그인)
    abstract User validateUser(String userId, String password);
    
    //사용자 삭제(회원탈퇴)
    abstract boolean deleteUser(String userId);

}
