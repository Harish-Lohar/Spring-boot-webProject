package com.mobiloitte.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobiloitte.webapp.dto.StudentDto;
import com.mobiloitte.webapp.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService ;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody StudentDto studentDto)
	{
		studentService.saveStudents(studentDto);
		return "Saved Successfully..";
	}

	
	
	
}
