package com.shop.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		// 서버에 애플리케이션을 요청하면 데이터만 전송한다는 뜻
public class AJAXController {
	
	@RequestMapping("/gettime")		// gettime을 요청하면 시간을 보낸다 aj01
	public Object gettime() {		// 서버에서 정보를 받기 위해 이런 객체가 필요
		Date d = new Date();
		return "서버시간: "+d.toString();
	}
	
	@RequestMapping("/search")		// aj02
	public Object search(String s) {
		String data = "";
		if (s.equals("a")) {		// s에 따라서 data를 바꾼다.
			data = "주식에 관심";
		}else if(s.equals("b")) {
			data = "햄버거에 관심";
		}else {
			data = "밥에 관심";
		}
		return data;
	}
	
	@RequestMapping("/checkid")		// aj03, aj04
	public Object checkid(String id) {	
		String result = "";
		if (id.equals("aaaaa") || id.equals("bbbbb") || id.equals("ccccc")) {
			result = "0";	// id 불가능
		} else {
			result = "1";	// id 가능
		}
		return result;
	}

}
