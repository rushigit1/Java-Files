package com.soft.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.model.CourseModel;
import com.soft.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/addnewcourse")
	public HashMap<String, Object> newCourse(@RequestBody CourseModel courseModel){
		
		return courseService.addNewCourse(courseModel);
		
	}
	
	@GetMapping("/findAllCourse")
	public List<CourseModel> getAllCourses(){
		
		return courseService.findAll();
	}
	@DeleteMapping ("/deleteById/{CourseId}")
	public String deleteEmpById (@PathVariable ("CourseId") int Id) {
	try {
		courseService.deleteCourseById(Id);
	} catch (Exception e) {
		e.printStackTrace();
	}
	{
		
		return "Deleted Successfully";
	
	}
	
	}
}
