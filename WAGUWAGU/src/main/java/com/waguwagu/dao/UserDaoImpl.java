package com.waguwagu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.waguwagu.dto.User;
import com.waguwagu.util.DBUtil;

public class UserDaoImpl implements UserDao {
	//singleton
	private UserDaoImpl() {};
	private static UserDao dao = new UserDaoImpl();
	public static UserDao getInstance() {
		return dao;
	}
	
	//DB연결 객체
	private DBUtil util = DBUtil.getInstance();

	//사용자 생성(회원가입)
	@Override
	public boolean insertUser(User user) {
		return false;
	}

	//사용자 존재 여부 확인(이미 존재하는 아이디)
	@Override
	public boolean isUserExist(String userId) {
		return false;
	}

	//사용자 정보를 데이터베이스에 저장
	@Override
	public boolean saveUser(User user) {
		return false;
	}

	//사용자 인증(로그인)
	@Override
	public boolean validateUser(String userId, String password) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM USER WHERE userId = ?";
		User user = new User();
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user.setUserId(rs.getString("userId"));
				user.setPassword(rs.getString("userPassword"));
				user.setName(rs.getString("userName"));
				user.setEmail(rs.getString("userEmail"));
				user.setGender(rs.getString("userGender"));
			}else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(rs, pstmt, conn);
		}
		return true;
	}

	//사용자 삭제(회원탈퇴)
	@Override
	public boolean deleteUser(String userId) {
		return false;
	}

}
