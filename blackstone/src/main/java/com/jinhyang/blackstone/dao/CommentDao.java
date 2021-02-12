package com.jinhyang.blackstone.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.Comment;

@Repository
public interface CommentDao {
	//c
	public void createComment(Comment comment);
	//r
	public Comment selectByCommentNo(int no);
	public List<Comment> selectByBoardNo(int no);
	public List<Comment> selectByUserid(String uid);
	//u
	public void updateByCommentNo(Comment comment);
	
	//d
	public void deleteByCommentNo(int no);
}
