package com.jinhyang.blackstone.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jinhyang.blackstone.dto.User;
import com.jinhyang.blackstone.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService service;
	
	//C
	@PostMapping("/join")
	public Object join(@RequestBody User user) {
		
		//아이디나 이메일이 중복된다면 가입할 수 없다.
		//1. 아이디 중복여부, 이메일 중복여부 체크
		int check = service.duplicateCheck(user.getUserid(), user.getEmail());
		if (check == 0) {//가입 진
			service.create(user);
			return new ResponseEntity<String>("회원가입완료",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Integer>(check, HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping("/login")
	public Object login(HttpSession session, @RequestBody String uid, @RequestBody String password) {
		User users = service.selectByUserid(uid);
		if(users == null) {

			return new ResponseEntity<String>("해당 아이디가 존재하지 않습니다.", HttpStatus.BAD_REQUEST);
		}
		else {
			
			if(users.getPassword().equals(password) && users.getUserid().equals(uid)) {
				session.setAttribute("user", users);
				return new ResponseEntity<String> ("로그인 성공",HttpStatus.OK);		
			}
			else {

				return new ResponseEntity<String>("비밀번호가 일치하지 않습니다.", HttpStatus.BAD_REQUEST);
			}	
		}			
		
	}
	
	@GetMapping("/logout")
	public Object logout(HttpSession session) {
		session.removeAttribute("user");

		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//R
	//1. 아이디 통해서 데이터 조회 가능  ->관리자는모든 유저의 데이터 조회 가능 
	@GetMapping("/admin")
	public Object userDataForAdmin(@RequestBody String uid) {
		//1. 해당 계정이 admin이 맞는지확인
		

		return new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);
	}
	//2. 일반 회원은 본인의 계정만 조회가 가능하다.
	@GetMapping("/find")
	public Object userDataForAdmin(HttpSession session) {
		//1. 해당 계정이 admin이 맞는지확인
		User users = (User)session.getAttribute("user");
		User user = service.selectByUserid(users.getUserid());
		return new ResponseEntity<User> (user, HttpStatus.OK);
	}
	
	//U
	@PutMapping("/modify")
	public Object modify(HttpSession session, @RequestBody User user) {
		User users = (User)session.getAttribute("user");
		service.update(users);
		return new ResponseEntity<> (HttpStatus.OK);
		//여기서 데이터를 미리 수정 form에 띄울 수 있는 방법이 뭘까  -> front에서 session의 정보 처리!
		
	}
	@GetMapping("/test")
	public Object test(String uid) {
		User user = service.selectByUserid(uid);
		return "index";
		//여기서 데이터를 미리 수정 form에 띄울 수 있는 방법이 뭘까  -> front에서 session의 정보 처리!
		
	}
	
	//D
	@DeleteMapping()
	public Object delete(HttpSession session, @RequestBody String uid, @RequestBody String password) {
		User users = (User)session.getAttribute("user");
		if(users.getPassword().equals(password) && users.getUserid().equals(uid)) {
			service.delete(uid);
			return new ResponseEntity<> (HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity<> (HttpStatus.BAD_REQUEST);
			
		}
		
	}
}
