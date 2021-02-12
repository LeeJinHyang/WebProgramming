package com.jinhyang.blackstone.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.PhotoBook;

@Repository
public interface PhotoBookDao {
	public void create(PhotoBook book);
	public PhotoBook selectByPhotoBookNo(int no);
	public List<PhotoBook> selectByName(String name);
	public List<PhotoBook> selectByUid(String uid);
	public void update(PhotoBook book);
	public void delete(int no);
}
