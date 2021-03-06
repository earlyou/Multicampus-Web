package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView main(ModelAndView mv) {
		mv.addObject("center", "center");	// 앞 center라는 곳에 뒤 center가 들어가게 해라
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("media")
	public ModelAndView media(ModelAndView mv) {
		mv.setViewName("media");
		return mv;
	}
	
	@RequestMapping("html5")
	public ModelAndView html5(ModelAndView mv) {
		mv.addObject("center", "html5");	// 앞 center라는 곳에 뒤 html5가 들어가게 해라
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/js")
	public ModelAndView js(ModelAndView mv) {
		mv.addObject("center", "js");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/css3")
	public ModelAndView css3(ModelAndView mv) {
		mv.addObject("center", "css3");
		mv.setViewName("main");
		return mv;
	}
}