package com.jwxt.home.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/home")
public class HomeAction {
	//跳转到系统首页
	@RequestMapping(value="/home")
	public String home(){
		return "forward:/WEB-INF/jsp/home/home.jsp";
	}
	@RequestMapping(value="/top")
	public String top(){
		return "forward:/WEB-INF/jsp/home/top.jsp";
	}
	@RequestMapping(value="/frame")
	public String frame(){
		return "forward:/WEB-INF/jsp/home/frame.jsp";
	}
}
