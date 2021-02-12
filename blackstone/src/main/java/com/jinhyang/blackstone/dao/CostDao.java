package com.jinhyang.blackstone.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.Cost;

@Repository
public interface CostDao {
	//c
	public void create(Cost cost);
	
	//r
	public Cost selectByCostNo(int no);
	public List<Cost> selectByDate(Date start);
	
	//u
	public void updateByCostNo(Cost cost);
	
	
	//d
	public void delete(int no);
}
