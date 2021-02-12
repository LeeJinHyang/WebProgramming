package com.jinhyang.blackstone.dto;

import java.util.Date;

public class Cost {
	private int costNo;
	private String EI;
	private String content;
	private int price;
	private int total;
	private Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getCostNo() {
		return costNo;
	}
	public void setCostNo(int costNo) {
		this.costNo = costNo;
	}
	public String getEI() {
		return EI;
	}
	public void setEI(String eI) {
		EI = eI;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
