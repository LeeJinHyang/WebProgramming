package com.jinhyang.blackstone.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.Todolist;

@Repository
public class TodolistDaoImpl implements TodolistDao{
	@Autowired
	private SqlSession sql;
	@Override
	public void create(Todolist todo) {
		// TODO Auto-generated method stub
		sql.insert("todolist.insert", todo);
	}

	@Override
	public Todolist selectByTodoNo(int no) {
		// TODO Auto-generated method stub
		return sql.selectOne("todolist.selectByTodoNo", no);
	}

	@Override
	public List<Todolist> selectByTodoCheck(int check) {
		// TODO Auto-generated method stub
		return sql.selectList("todolist.selectByContent", check);
	}

	@Override
	public List<Todolist> selectByDate(Date date) {
		// TODO Auto-generated method stub
		return sql.selectList("todolist.selectByDate", date);
	}

	@Override
	public List<Todolist> selectByContent(String content) {
		// TODO Auto-generated method stub
		return sql.selectList("todolist.selectByContent", content);
	}

	@Override
	public void update(Todolist todo) {
		// TODO Auto-generated method stub
		sql.update("todolist.update", todo);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		sql.delete("todolist.delete", no);
	}

}
