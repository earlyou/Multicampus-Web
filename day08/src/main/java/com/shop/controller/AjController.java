package com.shop.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjController {
	@RequestMapping("/ajax")
	public String ajax(Model m) {
		m.addAttribute("center","ajax/center");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	
	@RequestMapping("/register_formimpl")	// aj03
	public String register_formimpl(Model m, String id, String pwd) {
		System.out.println(id+" "+pwd);
		m.addAttribute("center","ajax/registerok");
		m.addAttribute("left","ajax/left");
		m.addAttribute("rid",id);
		return "main";
	}
	
	@RequestMapping("/register_aj03")	// aj03
	public String register_aj03(Model m, String id, String pwd, 
			String name, Date dob, String gender, String email, String meal) {
		System.out.println("id: "+id+"\npwd: "+pwd+"\nname: "+name+"\ndob: "+dob+
							"\ngender: "+gender+"\nemail: "+email+"\nmeal: "+meal);
		m.addAttribute("center","ajax/registerokaj03");
		m.addAttribute("left","ajax/left");
		m.addAttribute("id",id);
		m.addAttribute("pwd",pwd);
		m.addAttribute("name",name);
		m.addAttribute("dob",dob);
		m.addAttribute("gender",gender);
		m.addAttribute("email",email);
		m.addAttribute("meal",meal);
		return "main";
	}
	
	@RequestMapping("/aj01")
	public String aj01(Model m) {
		m.addAttribute("center","ajax/aj01");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj02")
	public String aj02(Model m) {
		m.addAttribute("center","ajax/aj02");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj03")
	public String aj03(Model m) {
		m.addAttribute("center","ajax/aj03");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj04")
	public String aj04(Model m) {
		m.addAttribute("center","ajax/aj04");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj05")
	public String aj015(Model m) {
		m.addAttribute("center","aj05/center");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj06")
	public String aj06(Model m) {
		m.addAttribute("center","aj06/center");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj07")
	public String aj07(Model m) {
		m.addAttribute("center","aj07/center");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj08")
	public String aj08(Model m) {
		m.addAttribute("center","aj08/center");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj09")
	public String aj09(Model m) {
		m.addAttribute("center","aj09/center");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj10")
	public String aj10(Model m) {
		m.addAttribute("center","aj10/center");
		m.addAttribute("left","ajax/left");
		return "main";
	}
}