package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String main(Model m) {
		return "main";
	}
	@RequestMapping("/about")
	public String about(Model m) {
		m.addAttribute("center", "about");
		return "main";
	}
	@RequestMapping("/project")
	public String project(Model m) {
		m.addAttribute("center", "project");
		return "main";
	}
	@RequestMapping("/contact")
	public String contact(Model m) {
		m.addAttribute("center", "contact");
		return "main";
	}
	@RequestMapping("/login")
	public String login(Model m) {
		m.addAttribute("center", "login");
		return "main";
	}
	@RequestMapping("/submenu11")
	public String submenu11(Model m) {
		m.addAttribute("center", "about");
		m.addAttribute("acenter", "about/submenu11");
		return "main";
	}
	@RequestMapping("/submenu12")
	public String submenu12(Model m) {
		m.addAttribute("center", "about");
		m.addAttribute("acenter", "about/submenu12");
		return "main";
	}@RequestMapping("/submenu13")
	public String submenu13(Model m) {
		m.addAttribute("center", "about");
		m.addAttribute("acenter", "about/submenu13");
		return "main";
	}@RequestMapping("/submenu21")
	public String submenu21(Model m) {
		m.addAttribute("center", "about");
		m.addAttribute("acenter", "about/submenu21");
		return "main";
	}
	@RequestMapping("/submenu22")
	public String submenu22(Model m) {
		m.addAttribute("center", "about");
		m.addAttribute("acenter", "about/submenu22");
		return "main";
	}@RequestMapping("/submenu23")
	public String submenu23(Model m) {
		m.addAttribute("center", "about");
		m.addAttribute("acenter", "about/submenu23");
		return "main";
	}@RequestMapping("/submenu31")
	public String submenu31(Model m) {
		m.addAttribute("center", "about");
		m.addAttribute("acenter", "about/submenu31");
		return "main";
	}
	@RequestMapping("/submenu32")
	public String submenu32(Model m) {
		m.addAttribute("center", "about");
		m.addAttribute("acenter", "about/submenu32");
		return "main";
	}@RequestMapping("/submenu33")
	public String submenu33(Model m) {
		m.addAttribute("center", "about");
		m.addAttribute("acenter", "about/submenu33");
		return "main";
	}
	@RequestMapping("/address")
	public String address(Model m) {
		m.addAttribute("center", "address");
		return "main";
	}
}