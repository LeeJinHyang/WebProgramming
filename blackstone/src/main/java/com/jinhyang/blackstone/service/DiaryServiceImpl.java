package com.jinhyang.blackstone.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dao.DiaryDao;
import com.jinhyang.blackstone.dto.Diary;

@Service
public class DiaryServiceImpl implements DiaryService{
	@Autowired
	private DiaryDao dao;
	
	@Override
	public void create(Diary diary) {
		// TODO Auto-generated method stub
		dao.create(diary);
	}

	@Override
	public Diary selectByDiaryNo(int no) {
		// TODO Auto-generated method stub
		return dao.selectByDiaryNo(no);
	}

	@Override
	public List<Diary> selectByDate(Date date) {
		// TODO Auto-generated method stub
		return dao.selectByDate(date);
	}

	@Override
	public List<Diary> selectBySubject(String subject) {
		// TODO Auto-generated method stub
		return dao.selectBySubject(subject);
	}

	@Override
	public void update(Diary diary) {
		// TODO Auto-generated method stub
		dao.update(diary);
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		dao.delete(no);
	}

}
