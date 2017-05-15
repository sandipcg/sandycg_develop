package com.web.controller;

import com.web.pojo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentdetails")
public class StudentController {

	@RequestMapping("/rollno")
	public Student getStudentDetails(String rollno) {
		// Student student=studentservice.getStudentByRollNo(rolno)
	
		
		return null;
	}
	
}
