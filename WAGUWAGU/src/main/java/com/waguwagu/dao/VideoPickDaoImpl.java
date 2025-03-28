package com.waguwagu.dao;

import java.util.List;

import com.waguwagu.dto.Video;

public class VideoPickDaoImpl implements VideoPickDao{
	
	private static VideoPickDao dao = new VideoPickDaoImpl();
	
	private VideoPickDaoImpl() {
	}
	
	public static VideoPickDao getInstance() {
		return dao;
	}

	@Override
	public int insertPick(String userId, int videoId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePick(String userId, int videoId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Video> findPickedVideoByUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countPickByVideoId(int videoId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsPick(String userId, int videoId) {
		// TODO Auto-generated method stub
		return false;
	}
}
