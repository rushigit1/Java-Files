package com.soft.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.soft.model.CourseModel;

public interface CourseRepository extends JpaRepository<CourseModel, Integer>{

	@Query(value = "SELECT * FROM curdtable.courses_details where course_name=?1",nativeQuery = true)
	Optional<CourseModel> findCourseByName(String courseName);
	
	@Transactional
	@Modifying
	@Query(nativeQuery = true,value = "DELETE FROM curdtable.courses_details where Course_id=?")
	public void deleteCourseById(int Id);

}
