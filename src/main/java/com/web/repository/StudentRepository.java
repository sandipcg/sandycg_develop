package com.web.repository;

import com.web.pojo.Student;
import lombok.Data;

import java.util.List;
 
@Data
public class StudentRepository {
private static  List<Student>  students;
public static  List<Student> getStudentList(){
	return students;
}

}
