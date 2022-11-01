package com.mobiloitte.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobiloitte.webapp.dto.StudentDto;
import com.mobiloitte.webapp.model.Students;
import com.mobiloitte.webapp.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService ;
	
	@PostMapping("/savestudent")
	public String saveStudent(@RequestBody StudentDto studentDto)
	{
		studentService.saveStudents(studentDto);
		return "Saved Successfully..";
	}
	
	@GetMapping("/all")
	public List<Students> All (@RequestBody Students students){
		
		return studentService.getData(students);
	}
	
	

	
	
	
}
