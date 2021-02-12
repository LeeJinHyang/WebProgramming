package com.jinhyang.blackstone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dto.PhotoBook;
@Service
public interface PhotoBookService {
	public void create(PhotoBook book);
	public PhotoBook selectByPhotoBookNo(int no);
	public List<PhotoBook> selectByName(String name);
	public List<PhotoBook> selectByUid(String uid);
	public void update(PhotoBook book);
	public void delete(int no);
}
