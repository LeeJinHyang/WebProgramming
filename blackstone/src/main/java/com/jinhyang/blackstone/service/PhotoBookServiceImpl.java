package com.jinhyang.blackstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dao.PhotoBookDao;
import com.jinhyang.blackstone.dto.PhotoBook;

@Service
public class PhotoBookServiceImpl implements PhotoBookService{
	@Autowired
	private PhotoBookDao dao;
	@Override
	public void create(PhotoBook book) {
		// TODO Auto-generated method stub
		dao.create(book);
	}

	@Override
	public PhotoBook selectByPhotoBookNo(int no) {
		// TODO Auto-generated method stub
		return dao.selectByPhotoBookNo(no);
	}

	@Override
	public List<PhotoBook> selectByName(String name) {
		// TODO Auto-generated method stub
		return dao.selectByName(name);
	}

	@Override
	public List<PhotoBook> selectByUid(String uid) {
		// TODO Auto-generated method stub
		return dao.selectByUid(uid);
	}

	@Override
	public void update(PhotoBook book) {
		// TODO Auto-generated method stub
		dao.update(book);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		dao.delete(no);
	}

}
