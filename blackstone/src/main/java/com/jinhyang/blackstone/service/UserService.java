package com.jinhyang.blackstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dto.User;
@Service
public interface UserService {
	public void create(User user);
	public User selectByUserid(String uid);
	public int duplicateCheck(String uid, String email);
	public void update(User user);
	public void delete(String uid);
}
