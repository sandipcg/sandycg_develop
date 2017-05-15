package com.web.pojo;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Builder
@NoArgsConstructor

@Setter


public class Student {
private String student_name;
private String rollno;
private String student_class;
private String section;
private int grade;
public Student(String student_name,String rollno,String student_class,String section,int grade){
	this.student_name=student_name;
	this.rollno=rollno;
	this.student_class=student_class;
	this.section=section;
	this.grade=grade;
}
public void setRollno(String rollno){
	this.rollno=rollno;
}
public String getRollno(){
	return this.rollno;
}
}

