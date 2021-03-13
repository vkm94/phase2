package com.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "myuser")
public class User {
	
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uname=" + uname + ", password=" + password + ", email=" + email + ", city="
				+ city + "]";
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	private int uId;
	private String uname;
private String password;
private String email;
public User(String uname, String password, String email, String city) {
	super();
	this.uname = uname;
	this.password = password;
	this.email = email;
	this.city = city;
}
private String city;
	
	

}
