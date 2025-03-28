package com.waguwagu.service;

import java.util.List;

import com.waguwagu.dto.Video;

public interface VideoService {
	
	//조회수 순 정렬
	public abstract List<Video> getListByViewCnt();
	
	//최신 순 정렬
	public abstract List<Video> getListByRegTime();
	
	//찜 개수 순 정렬
	public abstract List<Video> getListByPickCnt();
	
	//카테고리 별 정렬 
	public abstract List<Video> getListOfCat(String part);
	
	
}
