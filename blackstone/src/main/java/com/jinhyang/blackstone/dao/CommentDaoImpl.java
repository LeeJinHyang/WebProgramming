package com.jinhyang.blackstone.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.Comment;

@Repository
public class CommentDaoImpl implements CommentDao{
	private SqlSession sql;
	
	@Override
	public void createComment(Comment comment) {
		// TODO Auto-generated method stub
		sql.insert("comment.insert", comment);
	}

	@Override
	public Comment selectByCommentNo(int no) {
		// TODO Auto-generated method stub
		return sql.selectOne("comment.selectByCommentNo", no);
	}

	@Override
	public List<Comment> selectByBoardNo(int no) {
		// TODO Auto-generated method stub
		return sql.selectList("comment.selectByBoardNo", no);
	}

	@Override
	public List<Comment> selectByUserid(String uid) {
		// TODO Auto-generated method stub
		return sql.selectList("comment.selectByUserId", uid);
	}

	@Override
	public void updateByCommentNo(Comment comment) {
		// TODO Auto-generated method stub
		sql.update("comment.updateByCommentNo", comment);
	}

	@Override
	public void deleteByCommentNo(int no) {
		// TODO Auto-generated method stub
		sql.delete("comment.deleteByCommentNo", no);
	}

}
