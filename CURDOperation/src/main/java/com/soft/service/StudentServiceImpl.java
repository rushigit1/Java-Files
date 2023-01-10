package com.soft.service;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.model.StudentModel;
import com.soft.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository StudentRepository;
	
@Override
	public HashMap<String, Object> saveStudentDetails(StudentModel studentmodel) {
		HashMap<String, Object> response = new HashMap<>();
		try {
			Optional<StudentModel> checkStudent = StudentRepository.findByEmail(studentmodel.getStdEmail());
			if(checkStudent.isPresent()) {
			response.put("Message", "Email already exists..");
			response.put("status", false);
			}else {
				response.put("Data", StudentRepository.save(studentmodel));
				response.put("status", true);
				response.put("Message", "You have register sucessfully..!");
			}
			} catch (Exception e) {
			e.printStackTrace();
			}
		return response;
}
@Override
public HashMap<String, Object> signInStudent(String std_email, String password) {
	HashMap<String, Object> response = new HashMap<>();
	
	try {
		
		StudentModel studentModel =  StudentRepository.signInStudent(std_email, password);
		if(studentModel==null) {
			response.put("status", false);
			response.put("Message", "Incorrect Email or Password");
		}else {
			response.put("status", true);
			response.put("Message", "login sucessful");
			response.put("studentdata", studentModel);
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return response;
}
}
