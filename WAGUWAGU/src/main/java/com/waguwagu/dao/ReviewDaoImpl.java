package com.waguwagu.dao;

import java.util.List;

import com.waguwagu.dto.Review;

public class ReviewDaoImpl implements ReviewDao {
	//singleton
	private ReviewDaoImpl(){};
	private static ReviewDao dao = new ReviewDaoImpl();
	public static ReviewDao getInstance() {
		return dao;
	}

	@Override
	public List<Review> getList() {
		return null;
	}

	@Override
	public Review selectOne(int reviewId) {
		return null;
	}

	@Override
	public boolean insertReview(Review review) {
		return false;
	}

	@Override
	public boolean updateReview(Review review) {
		return false;
	}

	@Override
	public boolean deleteReview(int reviewId) {
		return false;
	}

	@Override
	public boolean updateViewCnt(int reviewId) {
		return false;
	}

}
