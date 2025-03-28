package com.waguwagu.dao;

import java.util.List;

import com.waguwagu.dto.Video;

public interface VideoPickDao {
	
	//1. 찜 추가
	public abstract int insertPick(String userId, int videoId);
	
	//2. 찜 삭제
	public abstract int deletePick(String userId, int videoId);
	
	//3. 사용자가 찜한 영상 리스트 조회
	List<Video> findPickedVideoByUser(String userId);
	
	//4. 특정 영상의 찜 개수 조회
	int countPickByVideoId(int videoId);
	
	//5. 사용자가 특정 영상을 찜했는지 확인
	boolean existsPick(String userId, int videoId);
	
	
}
