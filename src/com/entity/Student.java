package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", state=" + state + ", uId=" + uId + "]";
	}
	private String name;
	private String email;
	private String state;
	private int uId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Id
	@GeneratedValue
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public Student(String name, String email, String state) {
		super();
		this.name = name;
		this.email = email;
		this.state = state;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
