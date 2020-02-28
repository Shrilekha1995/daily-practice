package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(ModelMap model){
		
		model.addAttribute("greeting","hello shreya from spring 4 mvc");
		return "welcome";
	}
	
	
	@RequestMapping(value="/helloagain",method=RequestMethod.GET)
	public String sayHElloAgain(ModelMap model)
	{
		model.addAttribute("greeting","hello world again from spring 4 mvc");
		return "welcome";
		
	}
	

}

