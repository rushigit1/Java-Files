package com.soft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Student_model")
public class StudentModel {
	@Id
	@SequenceGenerator(name = "std_seq", initialValue = 110)
	@Column(name="std_id")
	private int stdId;
	@Column(name="std_name")
	private String stdName;
	@Column(name="std_email")
	private String stdEmail;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentModel(int stdId, String stdName, String stdEmail, String userName, String password) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdEmail = stdEmail;
		this.userName = userName;
		this.password = password;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdEmail() {
		return stdEmail;
	}
	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "StudentModel [stdId=" + stdId + ", stdName=" + stdName + ", stdEmail=" + stdEmail + ", userName="
				+ userName + ", password=" + password + "]";
	}
	

}
