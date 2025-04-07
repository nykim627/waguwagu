package com.waguwagu.dto;

import java.time.LocalDateTime;

public class Review {
	private int reviewId;
	private String reviewTitle;
	private String reviewContent;
	private int reviewViewCnt;
	private LocalDateTime reviewRegDate; //등록일자
	private LocalDateTime reviewUpdatedAt;     //수정일자
	private String reviewWriter; //외래 키(User-userId참조)
	private int videoId; //외래 키(Video-videoID참조)
	
	//기본생성자
	public Review() {
		super();
	}
	
	//모든 필드를 포함하는 생성자
	public Review(int reviewId, String reviewTitle, String reviewContent, int reviewViewCnt,
			LocalDateTime reviewRegDate, LocalDateTime reviewUpdatedAt, String reviewWriter, int videoId) {
		super();
		this.reviewTitle = reviewTitle;
		this.reviewContent = reviewContent;
		this.reviewViewCnt = reviewViewCnt;
		this.reviewRegDate = reviewRegDate;
		this.reviewUpdatedAt = reviewUpdatedAt;
		this.reviewWriter = reviewWriter;
		this.videoId = videoId;
	}
	
	//getter & setter
	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public int getReviewViewCnt() {
		return reviewViewCnt;
	}

	public void setReviewViewCnt(int reviewViewCnt) {
		this.reviewViewCnt = reviewViewCnt;
	}

	public LocalDateTime getReviewRegDate() {
		return reviewRegDate;
	}

	public void setReviewRegDate(LocalDateTime reviewRegDate) {
		this.reviewRegDate = reviewRegDate;
	}

	public LocalDateTime getreviewUpdatedAt() {
		return reviewUpdatedAt;
	}

	public void setreviewUpdatedAt(LocalDateTime reviewUpdatedAt) {
		this.reviewUpdatedAt = reviewUpdatedAt;
	}

	public String getReviewWriter() {
		return reviewWriter;
	}

	public void setReviewWriter(String reviewWriter) {
		this.reviewWriter = reviewWriter;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	//toString
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", reviewTitle=" + reviewTitle + ", reviewContent=" + reviewContent
				+ ", reviewViewCnt=" + reviewViewCnt + ", reviewRegDate=" + reviewRegDate + ", UpdatedAt=" + reviewUpdatedAt
				+ ", reviewWriter=" + reviewWriter + ", videoId=" + videoId + "]";
	}	
}
