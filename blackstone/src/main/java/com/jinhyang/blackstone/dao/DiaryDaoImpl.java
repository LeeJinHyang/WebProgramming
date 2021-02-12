package com.jinhyang.blackstone.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.Diary;

@Repository
public class DiaryDaoImpl implements DiaryDao {

	@Autowired
	private SqlSession sql;
	@Override
	public void create(Diary diary) {
		// TODO Auto-generated method stub
		sql.insert("diary.insert", diary);
	}

	@Override
	public Diary selectByDiaryNo(int no) {
		// TODO Auto-generated method stub
		return sql.selectOne("diary.selectByDiaryNo", no);
	}

	@Override
	public List<Diary> selectByDate(Date date) {
		// TODO Auto-generated method stub
		return sql.selectList("diary.selectByDate", date);
	}

	@Override
	public void update(Diary diary) {
		// TODO Auto-generated method stub
		sql.update("diary.update", diary);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		sql.delete("diary.deleteByDiaryNo", no);
	}

	@Override
	public List<Diary> selectBySubject(String subject) {
		// TODO Auto-generated method stub
		return sql.selectList("diary.selectBySubject", subject);
	}

}
