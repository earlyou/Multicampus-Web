package com.multi.controller;

import java.sql.Date;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	HashMap<String,mem> map = new HashMap<String, mem>();
	mem m = new mem();
	@RequestMapping("/")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/register_view")
	public ModelAndView register_view(ModelAndView mv) {
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping("/login_view")
	public ModelAndView login_view(ModelAndView mv) {
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping("/product_view")
	public ModelAndView product_view(ModelAndView mv) {
		mv.setViewName("product");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv, String id, String pwd, String name, Date birth, String gender) {
		mv.setViewName("registerok");
		mv.addObject("id", id);
		mv.addObject("pwd", pwd);
		mv.addObject("name", name);
		mv.addObject("date", birth);
		mv.addObject("gender", gender);
		m = new mem(id,pwd,name,birth,gender);
		map.put(m.getId(), m);
		mv.addObject("map",map.get(m.getId()));
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(ModelAndView mv, String id, String pwd) {
		m = new mem(id, pwd);
		if (map.containsKey(id) && map.get(id).getPwd().equals(pwd)) {
			mv.addObject("ii",id);
			mv.setViewName("loginok");
		} else {
			mv.setViewName("loginfail");
		}
		return mv;
	}
}
