package com.shop.controller;

import java.util.Date;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		// 서버에 애플리케이션을 요청하면 데이터만 전송한다는 뜻
public class AJAXController {
	
	@RequestMapping("/gettime")		// gettime을 요청하면 시간을 보낸다 aj01
	public Object gettime() {		// Object 리턴
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
	
	@RequestMapping("/getdata")		// aj05
	public Object getdata() {
		JSONArray ja = new JSONArray();
		for(int i=0;i<6;i++) {		// DB가 없기 때문에 임의로 DB를 구현
			JSONObject jo = new JSONObject();
			jo.put("id", "id0"+i);
			jo.put("name", "james"+i);
			Random r = new Random();
			int a = r.nextInt(50)+1;
			jo.put("age", a);
			ja.add(jo);		// JSON 배열에 JSON 객체 6개를 넣는다
		}
		return ja;		// [{},{},...]JSON 형태로 return
	}
	
	@RequestMapping("/getchart")		// aj07
	public Object getchart() {
		JSONArray ja = new JSONArray();
		// [10,20,33,44,...]이런 식으로 데이터 넣기
		for(int i=0;i<15;i++) {		// 15개 객체
			Random r = new Random();
			int data = r.nextInt(50)+1;
			ja.add(data);
		}
		
		return ja;
	}
}
