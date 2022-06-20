package com.multi.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main(Model m) {
		return "main";
	}
	
	@RequestMapping("/loginmain")
	public String modifymain(Model m) {
		m.addAttribute("center", "modify/loginmain");
		m.addAttribute("top", "modify/loginmaintop");
		return "main";
	}
	
	@RequestMapping("/applymain")
	public String applymain(Model m) {
		m.addAttribute("center", "apply/applymain");
		m.addAttribute("top", "apply/applymaintop");
		return "main";
	}
	@RequestMapping("/findmapmain")
	public String findmapmain(Model m) {
		m.addAttribute("center", "map/findmapmain");
		m.addAttribute("top", "map/findmapmaintop");
		return "main";
	}
	
	@RequestMapping("/apply")
	public String apply(Model m, String curri, String appname, String gender,
			Date dob, String school, String grade, String clss, String postcode,
			String roadAddress, String jibunAddress, String detailAddress,
			/*JSONArray giftedarray,*/ /*String idpic,*/ String parname, String rela,
			String phonenum, Date payment, String bank, String payname,
			/*String paypic,*/ String id, String pwd, String yeartable1, 
			String gname1, String en1, String yeartable2, String gname2, String en2) {
		m.addAttribute("curri",curri);					m.addAttribute("appname",appname);
		m.addAttribute("gender",gender);				m.addAttribute("dob",dob);
		m.addAttribute("school",school);				m.addAttribute("grade",grade);
		m.addAttribute("clss",clss);					m.addAttribute("postcode",postcode);
		m.addAttribute("roadAddress",roadAddress);		m.addAttribute("jibunAddress",jibunAddress);
		m.addAttribute("detailAddress",detailAddress);	/*m.addAttribute("giftedarray",giftedarray);*/
		/*m.addAttribute("idpic",idpic);*/				m.addAttribute("parname",parname);
		m.addAttribute("rela",rela);					m.addAttribute("phonenum",phonenum);
		m.addAttribute("payment",payment);				m.addAttribute("bank",bank);
		m.addAttribute("payname",payname);				/*m.addAttribute("paypic",paypic);*/
		m.addAttribute("id",id);						m.addAttribute("pwd",pwd);
		m.addAttribute("yeartable1",yeartable1);		m.addAttribute("gname1",gname1);
		m.addAttribute("en1",en1);						m.addAttribute("yeartable2",yeartable2);
		m.addAttribute("gname2",gname2);				m.addAttribute("en2",en2);
		m.addAttribute("center", "apply/applyconfirm");	m.addAttribute("top", "apply/applyconfirmtop");
		return "main";
	}
	
	@RequestMapping("/modifymain")
	public String login(Model m) {
		m.addAttribute("mcurri","중등심화1");						m.addAttribute("mappname","신승욱");
		m.addAttribute("mgender","남자");							m.addAttribute("mdob","2022-08-19");
		m.addAttribute("mschool","멀티캠퍼스");					m.addAttribute("mgrade","3");
		m.addAttribute("mclss","5");							m.addAttribute("mpostcode","06220");
		m.addAttribute("mroadAddress","서울 강남구 테헤란로 212");	m.addAttribute("mjibunAddress","서울 강남구 역삼동 718-5");
		m.addAttribute("mdetailAddress","멀티캠퍼스");				m.addAttribute("mparname","승욱");
		m.addAttribute("mrela","본인");							m.addAttribute("mphonenum", "01012345678");
		m.addAttribute("mpayment", "2022-05-24");				m.addAttribute("mbank", "농협");
		m.addAttribute("mpayname","신승욱");						m.addAttribute("mid", "earlyou");
		m.addAttribute("mpwd","12345678");						
		m.addAttribute("center", "modify/modifymain");			m.addAttribute("top", "modify/modifymaintop");
		return "main";
	}
}
