package com.jinhyang.blackstone.dao;

import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.Board;
import com.jinhyang.blackstone.dto.User;

import java.util.List;

@Repository
public interface BoardDao {
	public Board selectByBoardNo(int no);
	public List<Board> selectByUserId(String uid);
	public List<Board> selectBySubject(String subject);
	public void create(Board board);
	public void updateByBoardNo(Board board, int no);
	public void deleteByBoardNo(int no);
}
