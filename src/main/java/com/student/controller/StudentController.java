package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceImpl StdImp;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student Std) {
		return new ResponseEntity<Student>(StdImp.saveStudent(Std), HttpStatus.CREATED);
	}
	@PostMapping("/deleteById")
	public ResponseEntity<Integer> deleteById(@RequestParam int id) {
		StdImp.deleteById(id);
		return new ResponseEntity<Integer>(id, HttpStatus.OK);

	}
	@GetMapping("/findById")
	public ResponseEntity<Student> findById(@RequestParam int id) {
		return new ResponseEntity<Student>(StdImp.findById(id), HttpStatus.OK);
	}
}
