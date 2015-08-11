package com.john.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/home")
	public ModelAndView showHome(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("home", "This is Home From Controller");
		mv.setViewName("home");
		
		return mv;
	}
	
	@RequestMapping(value="/aboutme")
	public String aboutMe(){
		return "aboutme";
	}
}//end class
