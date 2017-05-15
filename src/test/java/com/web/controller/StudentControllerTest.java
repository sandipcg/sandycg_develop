package com.web.controller;

import com.web.servicce.StudentService;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StudentControllerTest {

	@InjectMocks
	private StudentController underTest;
	@Mock
	private StudentService studentservice;
	

	public void shouldReturnStudentWhenInvoked(){
		Integer rollno=1234;
		//underTest.getStudentDetails("/rollno/"+rollno);
		//when(studentservice)
		
	}
}
