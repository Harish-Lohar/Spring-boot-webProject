package com.mobiloitte.webapp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mobiloitte.webapp.dao.StudentRepository;
import com.mobiloitte.webapp.dto.StudentDto;
import com.mobiloitte.webapp.model.Students;
import com.mobiloitte.webapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService  {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public String saveStudents(StudentDto studentDto) {
		Students students= new Students();
		students.setRollnumber(studentDto.getRollnumber());
		students.setFirstname(studentDto.getFirstname());
		students.setLastname(studentDto.getLastname());
		students.setDivision(studentDto.getDivision());
		students.setAddress(studentDto.getAddress());
		studentRepository.save(students);
		return null;
	}

	@Override
	public List<Students> getData(Students students) {
		List<Students> sdtList =studentRepository.findAll();
		return sdtList;
	}

	

	
	
}
