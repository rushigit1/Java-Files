package com.soft.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soft.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Integer>{
	@Query (value =  "SELECT * FROM curdtable.student_details where std_email=?1",nativeQuery = true)
	public Optional<StudentModel> findByEmail(String email);
	@Query(value = "SELECT * FROM curdtable.student_details where std_email=?1 and password=?2",nativeQuery = true)
	public StudentModel signInStudent(String std_email, String password);
}
