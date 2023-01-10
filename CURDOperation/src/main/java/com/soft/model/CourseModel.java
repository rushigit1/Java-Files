package com.soft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses_details")
public class CourseModel {

	@Id
	@Column(name="course_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CourseId;
	@Column(name="course_name")
	private String courseName;
	@Column(name="course_fees")
	private float courseFees;
	@Column(name="course_duration")
	private String courseDuration;
	public CourseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseModel(int courseId, String courseName, float courseFees, String courseDuration) {
		super();
		CourseId = courseId;
		this.courseName = courseName;
		this.courseFees = courseFees;
		this.courseDuration = courseDuration;
	}
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public float getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(float courseFees) {
		this.courseFees = courseFees;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	
}
