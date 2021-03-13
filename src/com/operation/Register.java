package com.operation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.utility.HibernateUtility;
@Entity
@Table(name="usersnew")
public class Register {
	@Id
	private int id;
	private String name;
	public Register(String name, String password) {
	super();
	this.name = name;
	this.password = password;
}
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	Session session= HibernateUtility.getSession();
	
	
	Transaction tx= session.beginTransaction();
	
}
