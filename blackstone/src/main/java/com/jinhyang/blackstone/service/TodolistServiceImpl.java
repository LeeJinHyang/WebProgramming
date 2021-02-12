package com.jinhyang.blackstone.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dao.TodolistDao;
import com.jinhyang.blackstone.dto.Todolist;

@Service
public class TodolistServiceImpl implements TodolistService{
	@Autowired
	private TodolistDao dao;
	@Override
	public void create(Todolist todo) {
		// TODO Auto-generated method stub
		dao.create(todo);
	}

	@Override
	public Todolist selectByTodoNo(int no) {
		// TODO Auto-generated method stub
		return dao.selectByTodoNo(no);
	}

	@Override
	public List<Todolist> selectByTodoCheck(int check) {
		// TODO Auto-generated method stub
		return dao.selectByTodoCheck(check);
	}

	@Override
	public List<Todolist> selectByDate(Date date) {
		// TODO Auto-generated method stub
		return dao.selectByDate(date);
	}

	@Override
	public List<Todolist> selectByContent(String content) {
		// TODO Auto-generated method stub
		return dao.selectByContent(content);
	}

	@Override
	public void update(Todolist todo) {
		// TODO Auto-generated method stub
		dao.update(todo);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		dao.delete(no);
	}
	
}
