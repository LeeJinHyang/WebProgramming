package com.jinhyang.blackstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dao.CommentpDao;

@Service
public class CommentpServiceImpl implements CommentpService{
	@Autowired
	private CommentpDao dao;
	
	@Override
	public void create(CommentpDao commentp) {
		// TODO Auto-generated method stub
		dao.create(commentp);
	}

	@Override
	public CommentpDao selectByCommentNo(int commentNo) {
		// TODO Auto-generated method stub
		return dao.selectByCommentNo(commentNo);
	}

	@Override
	public List<CommentpDao> selectByPhotoNo(int no) {
		// TODO Auto-generated method stub
		return dao.selectByPhotoNo(no);
	}

	@Override
	public List<CommentpDao> selectByUserId(String uid) {
		// TODO Auto-generated method stub
		return dao.selectByUserId(uid);
	}

	@Override
	public void update(CommentpDao comment) {
		// TODO Auto-generated method stub
		dao.updateByCommentNo(comment);
	}

	@Override
	public void delete(CommentpDao comment) {
		// TODO Auto-generated method stub
		dao.deleteByCommentNo(comment);
	}

}
