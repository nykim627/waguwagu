package com.waguwagu.service;

import java.util.List;

import com.waguwagu.dto.Video;

public interface VideoPickService {
	
	//특정 사용자가 영상을 찜
	public abstract boolean addPick(String userId, int videoId);
	
	//찜 해제
	public abstract boolean removePick(String userId, int videoId);
	
	//특정 사용자가 찜한 영상 목록
	public abstract List<Video> getPickedVideos(String userId);
	
	//특정 영상의 찜 개수
	public abstract int gePickCntOfVideo(int videoId);
	
	// 특정 사용자가 이 영상을 찜했는지 확인
	public abstract boolean isPicked(String userId, int videoId);
}
