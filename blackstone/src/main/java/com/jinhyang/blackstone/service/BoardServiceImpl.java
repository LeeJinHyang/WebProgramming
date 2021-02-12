package com.jinhyang.blackstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dao.BoardDao;
import com.jinhyang.blackstone.dto.Board;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDao dao;
	@Override
	public Board selectByBoardNo(int no) {
		// TODO Auto-generated method stub
		return dao.selectByBoardNo(no);
	}

	@Override
	public List<Board> selectByUserId(String uid) {
		// TODO Auto-generated method stub
		return dao.selectByUserId(uid);
	}

	@Override
	public List<Board> selectBySubject(String subject) {
		// TODO Auto-generated method stub
		return dao.selectBySubject(subject);
	}

	@Override
	public void create(Board board) {
		// TODO Auto-generated method stub
		dao.create(board);
	}

	@Override
	public void update(Board board, int no) {
		// TODO Auto-generated method stub
		dao.updateByBoardNo(board, no);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		dao.deleteByBoardNo(no);
	}

}
