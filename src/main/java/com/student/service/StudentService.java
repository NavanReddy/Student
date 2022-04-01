package com.student.service;

import com.student.model.Student;

public interface StudentService {
	public Student saveStudent(Student std);
	public void deleteById(int id);
	public Student findById(int id);
	
	

}
