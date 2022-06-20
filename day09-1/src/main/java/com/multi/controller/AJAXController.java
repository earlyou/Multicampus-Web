package com.multi.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AJAXController {
	@RequestMapping("/checkid")
	public Object checkid(String id) {
		String result = "";
		if (id.equals("aaaaa") || id.equals("bbbbb") || id.equals("ccccc")) {
			result = "0";	// id 불가능
		} else {
			result = "1";	// id 가능
		}
		return result;
	}
	
	@RequestMapping("/gettime")
	public Object gettime() {
		Date d = new Date();
		return d.toString();
	}
}
