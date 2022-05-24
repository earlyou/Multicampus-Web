package com.shop.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JqController {
	@RequestMapping("/register")	// jq04
	public String register(Model m, String id, String pwd, String name, Date dob, String gender, String email) {
		System.out.println(id);
		System.out.println(pwd);
		System.out.println(name);
		System.out.println(dob);
		System.out.println(gender);
		System.out.println(email+"\n");
		m.addAttribute("center", "jq/jq04");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	
	@RequestMapping("/loginimpl")	// login implement
	public String loginimpl(Model m, String id, String pwd) {// name='id', 'pwd'인 애들이 들어온다
		System.out.println(id+" "+pwd);		// debugging
		if (id.equals("qq") && pwd.equals("11")) {
			m.addAttribute("loginid",id);
			m.addAttribute("center", "jq/loginok");
		}else {
			m.addAttribute("center", "jq/loginfail");
		}
		m.addAttribute("left", "jq/left");
		return "main";
	}

	@RequestMapping("/registerimpl")	// jq07
	public String registerimpl(Model m, String name, 
			String pwd, String ch, String optradio, int sel) {
		System.out.printf("%s %s %s %s %d",name,pwd,ch,optradio,sel);
		m.addAttribute("rname",name);		// name을 rname에 넣는다, 서버로 전송 가능
		m.addAttribute("center","jq/registerok");
		m.addAttribute("left","jq/left");
		return "main";
	}

	@RequestMapping("/jq")
	public String jq(Model m) {
		m.addAttribute("center", "jq/center");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq01")
	public String jq01(Model m) {
		m.addAttribute("center", "jq/jq01");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq02")
	public String jq02(Model m) {
		m.addAttribute("center", "jq/jq02");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq03")
	public String jq03(Model m) {
		m.addAttribute("center", "jq/jq03");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq04")
	public String jq04(Model m) {
		m.addAttribute("center", "jq/jq04");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq05")
	public String jq05(Model m) {
		m.addAttribute("center", "jq/jq05");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq06")
	public String jq06(Model m) {
		m.addAttribute("center", "jq/jq06");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq07")
	public String jq07(Model m) {
		m.addAttribute("center", "jq/jq07");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq08")
	public String jq08(Model m) {
		m.addAttribute("center", "jq/jq08");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq09")
	public String jq09(Model m) {
		m.addAttribute("center", "jq/jq09");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq10")
	public String jq10(Model m) {
		m.addAttribute("center", "jq/jq10");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq11")
	public String jq11(Model m) {
		m.addAttribute("center", "jq/jq11");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq12")
	public String jq12(Model m) {
		m.addAttribute("center", "jq/jq12");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq13")
	public String jq13(Model m) {
		m.addAttribute("center", "jq/jq13");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq14")
	public String jq14(Model m) {
		m.addAttribute("center", "jq/jq14");
		m.addAttribute("left", "jq/left");
		return "main";
	}
	@RequestMapping("/jq15")
	public String jq15(Model m) {
		m.addAttribute("center", "jq/jq15");
		m.addAttribute("left", "jq/left");
		return "main";
	}
}
