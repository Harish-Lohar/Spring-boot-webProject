package com.mobiloitte.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobiloitte.webapp.dto.StudentDto;
import com.mobiloitte.webapp.service.StudentService;

@Controller
public class WepApiController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/index")
	public String index() {

		return "index";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "welcome";
	}
}
	
	
	
	
	
	