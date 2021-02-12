package com.jinhyang.blackstone.dto;

import java.util.Date;

public class Todolist {
	private int todoNo;
	private int todoCheck;
	private String content;
	private Date date;
	public int getTodoNo() {
		return todoNo;
	}
	public void setTodoNo(int todoNo) {
		this.todoNo = todoNo;
	}
	public int getTodoCheck() {
		return todoCheck;
	}
	public void setTodoCheck(int todoCheck) {
		this.todoCheck = todoCheck;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
