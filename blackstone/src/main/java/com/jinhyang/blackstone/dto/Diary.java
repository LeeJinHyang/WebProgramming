package com.jinhyang.blackstone.dto;

import java.util.Date;

public class Diary {
	private int diaryNo;
	private String subject;
	private String content;
	private String path;
	private Date date;
	public int getDiaryNo() {
		return diaryNo;
	}
	public void setDiaryNo(int diaryNo) {
		this.diaryNo = diaryNo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date datetime) {
		this.date = datetime;
	}
	
	
}
