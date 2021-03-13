package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
	@Id
	@GeneratedValue
private int id;
private String name;
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
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}
public Teacher( String name) {
	super();

	this.name = name;
}
@Override
public String toString() {
	return "Teacher [id=" + id + ", name=" + name + "]";
}

}
