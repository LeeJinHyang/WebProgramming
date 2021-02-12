package com.jinhyang.blackstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dto.Comment;
@Service
public interface CommentService {
	//c
		public void create(Comment comment);
		//r
		public Comment selectByCommentNo(int no);
		public List<Comment> selectByBoardNo(int no);
		public List<Comment> selectByUserid(String uid);
		//u
		public void update(Comment comment);
		
		//d
		public void delete(int no);

}
