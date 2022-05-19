package com.multi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	@RequestMapping("/")
	public ModelAndView main(ModelAndView mv) {
		mv.addObject("w", "Welcome !!");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/register_view")
	public ModelAndView register_view(ModelAndView mv) {
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping("/register")
	public void register(String id, String pwd, String gender) {
		
	}
	
	@RequestMapping("/login_view")
	public ModelAndView login_view(ModelAndView mv) {
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(ModelAndView mv, String id, String pwd) {
		if (id.equals("qqq") && pwd.equals("111")) {
			mv.addObject("ii",id);		// ii라는 이름에 id를 넣는다.
			mv.setViewName("loginok");	// 로그인 성공하면 loginok.html로 간다
		}else {
			mv.setViewName("loginfail");// 로그인 실패하면 loginfail.html로 간다
		}
		return mv;
	}
}