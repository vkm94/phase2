package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sub1")
public class Sub1 {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	public Sub1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sub1(String name) {
		super();
		this.name = name;
	}
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
	@Override
	public String toString() {
		return "Sub1 [id=" + id + ", name=" + name + "]";
	}
	

}
