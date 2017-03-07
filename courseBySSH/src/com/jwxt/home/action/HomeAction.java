package com.jwxt.home.action;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value="/home")
public class HomeAction {
	//跳转到系统首页
	@RequestMapping(value="/home")
	public String home(){
		return "forward:/WEB-INF/jsp/home/home.jsp";
	}
}
