package com.jinhyang.blackstone.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dto.Todolist;
@Service
public interface TodolistService {
	public void create(Todolist todo);
	
	public Todolist selectByTodoNo(int no);
	public List<Todolist> selectByTodoCheck(int check);
	public List<Todolist> selectByDate(Date date);
	public List<Todolist> selectByContent(String content);
	
	public void update(Todolist todo);
	
	public void delete(int no);
}
