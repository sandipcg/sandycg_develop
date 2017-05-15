package com.web.service;

import com.web.pojo.Student;
import com.web.repository.StudentRepository;
import com.web.servicce.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {
	@Mock
	StudentRepository studentRepo;
	@Mock
	StudentService studentService;
	@Mock
	Student student;
	List<Student> students;

	@Test
	public void should_find_student_by_rollno() throws Exception {
		students = new ArrayList<Student>();
		String rollno = "1234";
		Student dummyStudent = createDummyStudent(rollno);
		//student=mock(Student.class);
		//student.setRollno(rollno);
		students.add(dummyStudent);
		when(studentRepo.getStudentList()).thenReturn(students);
		when(studentService.getStudentByRollNo(rollno)).thenReturn(student);
		assertEquals(students.get(0), dummyStudent);
	}

	private Student createDummyStudent(String rollno) {

		return Student.builder().student_name("dummy_name").rollno(rollno).student_class("dummy_class").section("dummy_section").build();
	}

	@Test
	public void shouldFileTest() throws FileNotFoundException {
		FileInputStream in = new FileInputStream("x.txt");

	}
}