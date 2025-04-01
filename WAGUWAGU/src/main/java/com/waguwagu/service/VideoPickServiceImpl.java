package com.waguwagu.service;

import java.util.List;

import com.waguwagu.dao.VideoPickDao;
import com.waguwagu.dao.VideoPickDaoImpl;
import com.waguwagu.dto.Video;

public class VideoPickServiceImpl implements VideoPickService{
	
	private static VideoPickService service = new VideoPickServiceImpl();
	private VideoPickDao dao = VideoPickDaoImpl.getInstance();
	
	private VideoPickServiceImpl() {
	}
	
	public static VideoPickService getInstance() {
		return service;
	}
	
	@Override
	public boolean addPick(String userId, int videoId) {
		return false;
	}

	@Override
	public boolean removePick(String userId, int videoId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Video> getPickedVideos(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int gePickCntOfVideo(int videoId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isPicked(String userId, int videoId) {
		// TODO Auto-generated method stub
		return false;
	}

}
