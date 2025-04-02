package com.waguwagu.dto;

public class User {
    private String userId;   // 사용자 아이디
    private String password; // 비밀번호
    private String name;     // 사용자 이름
    private String gender;   // 사용자 성별
    private String email;    // 이메일
    
    //기본생성자
    public User() {
		super();
	}
    
    //모든 필드를 포함하는 생성자
	public User(String userId, String password) {
    	this.userId = userId;
    	this.password = password;
    }

	//getter & setter
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	//toString
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", gender=" + gender
				+ ", email=" + email + "]";
	}

	

}
