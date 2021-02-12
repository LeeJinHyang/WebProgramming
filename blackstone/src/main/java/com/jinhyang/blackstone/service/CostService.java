package com.jinhyang.blackstone.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dto.Cost;
@Service
public interface CostService {
	//c
		public void create(Cost cost);
		
		//r
		public Cost selectByCostNo(int no);
		public List<Cost> selectByDate(Date start);
		
		//u
		public void update(Cost cost);
		
		
		//d
		public void delete(int no);
}
