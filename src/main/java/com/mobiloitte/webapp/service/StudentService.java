package com.mobiloitte.webapp.service;

import java.util.List;

import com.mobiloitte.webapp.dto.StudentDto;
import com.mobiloitte.webapp.model.Students;

public interface StudentService {

	String saveStudents(StudentDto studentDto);

	List<Students> getData(Students students);



	

	

}
