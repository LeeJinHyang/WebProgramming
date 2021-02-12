package com.jinhyang.blackstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dao.CommentpDao;
@Service
public interface CommentpService {
	public void create(CommentpDao commentp);
	public CommentpDao selectByCommentNo(int commentNo);
	public List<CommentpDao> selectByPhotoNo(int no);
	public List<CommentpDao> selectByUserId(String uid);
	
	public void update(CommentpDao comment);
	
	public void delete(CommentpDao comment);
}
