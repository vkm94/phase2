package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class Class1 {
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
public Class1( String name , String Sub1) {
	super();
	
	this.name = name;
}

@Override
public String toString() {
	return "Class1 [id=" + id + ", name=" + name + "]";
}
public Class1() {
	super();
	// TODO Auto-generated constructor stub
}

}
