package com.jinhyang.blackstone.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentpDaoImpl implements CommentpDao{

	@Autowired
	public SqlSession sql;
	@Override
	public void create(CommentpDao commentp) {
		// TODO Auto-generated method stub
		sql.insert("commentp.insert",commentp);
	}

	@Override
	public CommentpDao selectByCommentNo(int commentNo) {
		// TODO Auto-generated method stub
		return sql.selectOne("commentp.selectByCommentNo", commentNo);
	}

	@Override
	public List<CommentpDao> selectByPhotoNo(int no) {
		// TODO Auto-generated method stub
		return sql.selectList("commentp.selectByBoardNo", no);
	}

	@Override
	public List<CommentpDao> selectByUserId(String uid) {
		// TODO Auto-generated method stub
		return sql.selectList("commentp.selectByUserId", uid);
		}

	@Override
	public void updateByCommentNo(CommentpDao comment) {
		// TODO Auto-generated method stub
		sql.update("commentp.updateByCommentNo", comment);
	}

	@Override
	public void deleteByCommentNo(CommentpDao comment) {
		// TODO Auto-generated method stub
		sql.delete("commentp.deleteByCommentNo", comment);
	}

}
