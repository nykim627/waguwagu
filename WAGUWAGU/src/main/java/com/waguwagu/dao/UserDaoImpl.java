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
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM USER WHERE userId = ?";
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(rs, pstmt, conn);
		}
		return false;
	}

	//사용자 정보를 데이터베이스에 저장
	@Override
	public boolean saveUser(User user) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO USER VALUES (?,?,?,?,?)";
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getName());
			pstmt.setString(5, user.getGender());
			int rs = pstmt.executeUpdate();
			if(rs==1) return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.close(conn, pstmt);
		}
		return false;
	}

	//사용자 인증(로그인)
	@Override
	public User validateUser(String userId, String password) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM USER WHERE userId = ? and userPassword = ?";
		User user = null;
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new User();
				user.setUserId(rs.getString("userId"));
				user.setPassword(rs.getString("userPassword"));
				user.setName(rs.getString("userName"));
				user.setEmail(rs.getString("userEmail"));
				user.setGender(rs.getString("userGender"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(rs, pstmt, conn);
		}
		return user;
	}

	//사용자 삭제(회원탈퇴)
	@Override
	public boolean deleteUser(User user) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM USER WHERE userId = ?";
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			int rs = pstmt.executeUpdate();
			if(rs==1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
