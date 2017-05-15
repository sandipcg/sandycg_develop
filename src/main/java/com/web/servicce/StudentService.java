package com.web.servicce;

import com.web.pojo.Student;
import com.web.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
	
public Student getStudentByRollNo(String rollNo){
	StudentRepository repository=new StudentRepository();
	List<Student> students=repository.getStudentList();
	for(Student student:students){
		return (student.getRollno().equals(rollNo)?student:null);
	}
	return null;
}

}
