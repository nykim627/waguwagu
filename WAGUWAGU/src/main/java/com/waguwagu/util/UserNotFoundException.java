package com.waguwagu.util;

public class UserNotFoundException extends CustomException {
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		super("등록되지 않은 아이디이거나 아이디 또는 비밀번호를 잘못 입력했습니다.");
	}

}
