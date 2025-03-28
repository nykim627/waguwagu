package com.waguwagu.service;

import java.util.List;

import com.waguwagu.dao.ReviewDao;
import com.waguwagu.dao.ReviewDaoImpl;
import com.waguwagu.dto.Review;

public class ReviewServiceImpl implements ReviewService {
	
	//싱글톤 패턴으로 관리
	private ReviewServiceImpl() {}
	private static ReviewService service = new ReviewServiceImpl();
	public static ReviewService getInstance() {
		return service;
	}
	
	//dao 가져오기
	private ReviewDao dao = ReviewDaoImpl.getInstance();

	@Override
	public List<Review> getList() {
		return null;
	}

	@Override
	public Review getReview(int reviewId) {
		return null;
	}

	@Override
	public boolean writeReview(Review review) {
		return false;
	}

	@Override
	public boolean removeReview(int reviewId) {
		return false;
	}

}
