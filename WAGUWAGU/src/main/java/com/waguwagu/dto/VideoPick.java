package com.waguwagu.dto;

public class VideoPick {
	private String userId;
	private int videoId;
	
	public VideoPick() {
	}
	
	public VideoPick(String userId, int videoId) {
		super();
		this.userId = userId;
		this.videoId = videoId;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	

}
