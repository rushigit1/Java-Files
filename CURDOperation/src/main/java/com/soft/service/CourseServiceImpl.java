package com.soft.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.model.CourseModel;
import com.soft.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public HashMap<String, Object> addNewCourse(CourseModel CourseModel) {

		HashMap<String, Object> response = new HashMap<>();
		try {
			
			Optional<CourseModel> getCourse = courseRepository.findCourseByName(CourseModel.getCourseName());
			if(getCourse.isPresent()) {
				
				response.put("Message", "This course already registerd");
				response.put("status", false);
			}else {
				response.put("CourseDetails", courseRepository.save(CourseModel));
				response.put("Message", "You have Added course Sucessfully..!");
				response.put("status", true);
				
			}
			
		} catch (Exception e) {
			
		}
		return response;
	}

	@Override
	public List<CourseModel> findAll() {
		
		return courseRepository.findAll();
	}

	@Override
	public void deleteCourseById(int CourseId) {
		try {
			courseRepository.deleteCourseById(CourseId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
