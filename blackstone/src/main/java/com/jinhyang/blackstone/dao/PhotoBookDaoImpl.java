package com.jinhyang.blackstone.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.PhotoBook;

@Repository
public class PhotoBookDaoImpl  implements PhotoBookDao{
	@Autowired
	private SqlSession sql;
	
	@Override
	public void create(PhotoBook book) {
		// TODO Auto-generated method stub
		sql.insert("photo.insert", book);
	}

	@Override
	public PhotoBook selectByPhotoBookNo(int no) {
		// TODO Auto-generated method stub
		return sql.selectOne("photo.selectByPhotoNo", no);
	}

	@Override
	public List<PhotoBook> selectByName(String name) {
		// TODO Auto-generated method stub
		return sql.selectList("photo.selectByName", name);
	}

	@Override
	public List<PhotoBook> selectByUid(String uid) {
		// TODO Auto-generated method stub
		return sql.selectList("photo.selectByUid", uid);
	}

	@Override
	public void update(PhotoBook book) {
		// TODO Auto-generated method stub
		sql.update("photo.update", book);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		sql.delete("photo.delete", no);
	}

}
