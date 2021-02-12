package com.jinhyang.blackstone.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.User;

@Repository
public interface UserDao {
	public void createUser(User user);
	public User getByUserid(String uid);
	public User getByEmail(String email);
	public void update(User user);
	public void deleteByUserid(String uid);
	
}
