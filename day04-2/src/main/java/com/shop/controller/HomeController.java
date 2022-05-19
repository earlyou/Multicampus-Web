package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model m) {
		m.addAttribute("center", "home");
		return "main";
	}
	// 127.0.0.1/home1에 접속하면 template/main.html으로 가는데, 
	// ${center}에는 home.html, ${scenter}에는 home1.html이 들어간다.
	@RequestMapping("/home1")
	public String home1(Model m) {
		m.addAttribute("center", "home");
		m.addAttribute("scenter", "home/home1");
		return "main";
	}
	
	@RequestMapping("/home2")
	public String home2(Model m) {
		m.addAttribute("center", "home");
		m.addAttribute("scenter", "home/home2");
		return "main";
	}
	
	@RequestMapping("/home3")
	public String home3(Model m) {
		m.addAttribute("center", "home");
		m.addAttribute("scenter", "home/home3");
		return "main";
	}
}
