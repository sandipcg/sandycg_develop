package com.web.repository;

import com.web.servicce.StudentService;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StudentRepositoryTest {

	@Mock
	StudentService studentService;
	public void should_add_elements(){
		// when service.addstudent-> that should be add in repository
		//when(studentService.addStudent(student))
		
	}
}
