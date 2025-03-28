package com.waguwagu.util;

public class ReviewOnlyUserException extends CustomException {
	private static final long serialVersionUID = 1L;

	public ReviewOnlyUserException() {
		super("로그인이 필요한 서비스입니다.");
	}
}
