package com.soft.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.soft.model.CourseModel;
import com.soft.model.StudentModel;

public interface CourseService {

	public HashMap<String, Object> addNewCourse(CourseModel CourseModel);
	
	public List<CourseModel> findAll();
	public void deleteCourseById(int CourseId);
	

}
