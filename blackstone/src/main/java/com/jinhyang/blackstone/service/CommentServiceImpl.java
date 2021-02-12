package com.jinhyang.blackstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dao.CommentDao;
import com.jinhyang.blackstone.dto.Comment;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired 
	private CommentDao dao;
	
	@Override
	public void create(Comment comment) {
		// TODO Auto-generated method stub
		dao.createComment(comment);
	}

	@Override
	public Comment selectByCommentNo(int no) {
		// TODO Auto-generated method stub
		return dao.selectByCommentNo(no);
	}

	@Override
	public List<Comment> selectByBoardNo(int no) {
		// TODO Auto-generated method stub
		return dao.selectByBoardNo(no);
	}

	@Override
	public List<Comment> selectByUserid(String uid) {
		// TODO Auto-generated method stub
		return dao.selectByUserid(uid);
	}

	@Override
	public void update(Comment comment) {
		// TODO Auto-generated method stub
		dao.updateByCommentNo(comment);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		dao.deleteByCommentNo(no);
	}

}
