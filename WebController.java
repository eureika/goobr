package com.ubersched.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@Scope("request")
public class WebController {
	
	@RequestMapping("/home")
	public ModelAndView displayHome() {
		return new ModelAndView("Home");
	}
	
	@RequestMapping("/submit")
	public ModelAndView submitForm() {
		/*form submit functions (dao, etc.)*/
		return new ModelAndView("redirect:/success.html");
	}
}
