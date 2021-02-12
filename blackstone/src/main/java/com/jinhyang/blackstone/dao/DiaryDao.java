package com.jinhyang.blackstone.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jinhyang.blackstone.dto.Diary;

@Repository
public interface DiaryDao {
	//c
	public void create(Diary diary);
	//r
	public Diary selectByDiaryNo(int no);
	public List<Diary> selectByDate(Date date);
	public List<Diary> selectBySubject(String subject);
	//u
	public void update(Diary diary);
	//d
	public void delete(int no);

}
