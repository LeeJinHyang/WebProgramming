package com.jinhyang.blackstone.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CommentpDao {

	public void create(CommentpDao commentp);
	public CommentpDao selectByCommentNo(int commentNo);
	public List<CommentpDao> selectByPhotoNo(int no);
	public List<CommentpDao> selectByUserId(String uid);
	
	public void updateByCommentNo(CommentpDao comment);
	
	public void deleteByCommentNo(CommentpDao comment);
	}
