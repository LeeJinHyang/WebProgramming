package com.jinhyang.blackstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dto.Board;
@Service
public interface BoardService {
	public Board selectByBoardNo(int no);
	public List<Board> selectByUserId(String uid);
	public List<Board> selectBySubject(String subject);
	public void create(Board board);
	public void update(Board board, int no);
	public void delete(int no);
}
