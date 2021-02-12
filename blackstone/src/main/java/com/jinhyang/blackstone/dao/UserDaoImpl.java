package com.jinhyang.blackstone.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private SqlSession sql;

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		sql.insert("user.insert",user);
	}

	@Override
	public User getByUserid(String uid) {
		// TODO Auto-generated method stub
		return sql.selectOne("user.selectByUserid", uid);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		sql.update("user.updateByUserid", user);
	}

	@Override
	public void deleteByUserid(String uid) {
		// TODO Auto-generated method stub
		sql.delete("user.deleteByUserid", uid);
		
	}


	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return sql.selectOne("user.selectByEmail", email);
	}
	
}
