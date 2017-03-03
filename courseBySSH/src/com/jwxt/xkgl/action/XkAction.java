package com.jwxt.xkgl.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/xkgl")
public class XkAction {

	
	@RequestMapping(value="/xk")
	public String xk(){
		
		return null;
	}
}
