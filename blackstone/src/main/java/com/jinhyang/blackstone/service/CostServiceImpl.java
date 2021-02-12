package com.jinhyang.blackstone.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dao.CostDao;
import com.jinhyang.blackstone.dto.Cost;

@Service
public class CostServiceImpl implements CostService{
	@Autowired
	private CostDao dao;
	@Override
	public void create(Cost cost) {
		// TODO Auto-generated method stub
		dao.create(cost);
	}

	@Override
	public Cost selectByCostNo(int no) {
		// TODO Auto-generated method stub
		return dao.selectByCostNo(no);
	}

	@Override
	public List<Cost> selectByDate(Date start) {
		// TODO Auto-generated method stub
		return dao.selectByDate(start);
	}

	@Override
	public void update(Cost cost) {
		// TODO Auto-generated method stub
		dao.updateByCostNo(cost);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		dao.delete(no);
	}

}
