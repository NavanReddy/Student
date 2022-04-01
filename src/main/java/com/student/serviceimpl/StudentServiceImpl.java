package com.student.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.exceptions.UserNotFoundException;
import com.student.model.Student;
import com.student.repository.StudentRepo;
import com.student.service.StudentService;

public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo stdrepo;

	@Override
	public Student saveStudent(Student std) {
		
		return stdrepo.save(std);
	}

	@Override
	public void deleteById(int id) {
		stdrepo.deleteById(id);
		
	}

	@Override
	public Student findById(int id) {
		Optional<Student> std = stdrepo.findById(id);
				{
			if(std.isPresent())
			{
				return std.get();
			
			}
			else
			{
				throw new UserNotFoundException("not found by id");
			}
				}
	}

}
