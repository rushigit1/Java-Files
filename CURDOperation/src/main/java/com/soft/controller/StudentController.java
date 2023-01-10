package com.soft.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soft.model.StudentModel;
import com.soft.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/saveStudent")
	public HashMap<String, Object> saveStudent(@RequestBody StudentModel studentModel){
		
		return studentService.saveStudentDetails(studentModel);
		
	}
	@GetMapping("/signIn")
	public HashMap<String, Object> studentSignIn(@RequestParam String std_email, @RequestParam String password) {
		
		return studentService.signInStudent(std_email, password);
	}
	

}
