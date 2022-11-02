package com.mobiloitte.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mobiloitte.webapp.service.StudentService;

@Controller
public class WepApiController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/index")
	public String index() {
//		crudservice.saveUserByHtml(crudDto);
		return "index";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		return "welcome";
	}
}
