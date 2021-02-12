package com.jinhyang.blackstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dao.UserDao;
import com.jinhyang.blackstone.dto.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao dao;
	
	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		dao.createUser(user);
	}

	@Override
	public User selectByUserid(String uid) {
		// TODO Auto-generated method stub
		return dao.getByUserid(uid);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		dao.update(user);
	}

	@Override
	public void delete(String uid) {
		// TODO Auto-generated method stub
		dao.deleteByUserid(uid);
	}

	@Override
	public int duplicateCheck(String uid, String email) {
		// TODO Auto-generated method stub
		User uidCheck = dao.getByUserid(uid);
		User emailCheck = dao.getByEmail(email);
		//3 -> 아이디, 이메일 모두 중복 
		if(uidCheck!=null && emailCheck != null) {
			return 3;
		}
		//1 -> 아이디 중복
		else if(uidCheck != null) {
			return 1;
		}
		//2 -> 이메일 중복
		else if(emailCheck != null) {
			return 2;
		}
		//0 -> 중복 X
		else return 0;
	}

}
