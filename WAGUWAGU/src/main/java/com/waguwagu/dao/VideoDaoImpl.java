package com.waguwagu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.waguwagu.dto.Video;
import com.waguwagu.util.DBUtil;

public class VideoDaoImpl implements VideoDao {

	private static VideoDao dao = new VideoDaoImpl();

	private VideoDaoImpl() {
	}

	public static VideoDao getInstance() {
		return dao;
	}

	@Override
	public List<Video> getVideosSortedByViewCnt() {
		return null;
	}

	@Override
	public List<Video> getVideosSortedByRegTime() {
		return null;
	}

	@Override
	public List<Video> getVideosSortedByPickCnt() {
		
		String sql = """
				SELECT v.*, COUNT(vp.videoId) AS pickCount
				FROM video v
				LEFT JOIN videoPick vp ON v.videoId = vp.videoId
				GROUP BY v.videoId
				ORDER BY pickCount DESC
				""";

		List<Video> videos = new ArrayList<>();

//		try (Connection conn = DBUtil.getConnection();
//				PreparedStatement pstmt = conn.prepareStatement(sql);
//				ResultSet rs = pstmt.executeQuery()) {
//			while (rs.next()) {
//				Video video = new Video();
//				video.setVideoId(rs.getInt("videoId"));
//				video.setVideoTitle(rs.getString("videoTitle"));
//				video.setVideoUrl(rs.getString("videoUrl"));
//				video.setVideoImgUrl(rs.getString("videoImgUrl"));
//				video.setVideoLevel(rs.getString("videoLevel"));
//				video.setVideoCat(rs.getString("videoCat"));
//				video.setVideoViewCnt(rs.getInt("videoViewCnt"));
//				video.setPickCount(rs.getInt("pickCount")); // ← 여기 중요!
//
//				videos.add(video);
//			}
//		} catch (Exception e) {
//			e.printStackTrace(); // 실무에선 로깅으로
//		}

		return videos;
	}

	@Override
	public List<Video> getVideosSortedByCat() {
		return null;
	}

}
