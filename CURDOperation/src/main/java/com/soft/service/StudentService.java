package com.soft.service;

import java.util.HashMap;

import com.soft.model.StudentModel;

public interface StudentService {
	
	public HashMap<String, Object> saveStudentDetails(StudentModel studentmodel);
	public HashMap<String, Object> signInStudent(String std_email, String password);

}
