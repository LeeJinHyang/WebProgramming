package com.jinhyang.blackstone.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.Cost;

@Repository
public class CostDaoImpl implements CostDao{

	@Autowired
	private SqlSession sql;
	
	@Override
	public void create(Cost cost) {
		// TODO Auto-generated method stub
		sql.insert("cost.insert", cost);
	}

	@Override
	public Cost selectByCostNo(int no) {
		// TODO Auto-generated method stub
		return sql.selectOne("cost.selectByCostNo", no);
	}

	@Override
	public List<Cost> selectByDate(Date start) {
		// TODO Auto-generated method stub
		return sql.selectList("cost.selectByDate", start);
	}

	@Override
	public void updateByCostNo(Cost cost) {
		// TODO Auto-generated method stub
		sql.update("cost.updateByCostNo", cost);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		sql.delete("cost.deleteByCostNo", no);
	}

}
