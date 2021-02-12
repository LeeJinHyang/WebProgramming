package com.jinhyang.blackstone.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jinhyang.blackstone.dto.Diary;
@Service
public interface DiaryService {
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
