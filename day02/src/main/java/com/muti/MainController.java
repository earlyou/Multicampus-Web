package com.muti;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/register")	// "register"에 id, pwd, age를 전송하겠다
	public void register(String id, String pwd, int age) {
		System.out.println(id+" "+pwd+" "+age);
	}
	
	@RequestMapping("/register2")	// "register"에 id, pwd, age를 전송하겠다
	public void register2(String id, String pwd, int age, String birth, String gender, String hobby, String car, String resume, String loginid, int range) {
		System.out.println(id+" "+pwd+" "+age);
		System.out.println(birth+" "+gender+" "+hobby);
		System.out.println(resume+" "+loginid+" "+range);
	}
}