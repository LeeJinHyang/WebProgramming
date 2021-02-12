package com.jinhyang.blackstone.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.Board;

@Repository
public class BoardDaoImpl implements BoardDao{
	@Autowired
	private SqlSession sql;
	@Override
	public Board selectByBoardNo(int no) {
		// TODO Auto-generated method stub
		return sql.selectOne("board.selectByBoardNo",no);
	}

	@Override
	public void create(Board board) {
		// TODO Auto-generated method stub
		sql.insert("board.insert");
	}

	@Override
	public void updateByBoardNo(Board board, int no) {
		// TODO Auto-generated method stub
		sql.update("board.updateByBoardNo", no);
	}

	@Override
	public void deleteByBoardNo(int no) {
		// TODO Auto-generated method stub
		sql.delete("board.deleteByBoardNo", no);
	}

	@Override
	public List<Board> selectByUserId(String uid) {
		// TODO Auto-generated method stub
		return sql.selectList("board.selectByUserid", uid);
	}

	@Override
	public List<Board> selectBySubject(String subject) {
		// TODO Auto-generated method stub
		return sql.selectList("board.selectBySubject", subject);
	}

}
