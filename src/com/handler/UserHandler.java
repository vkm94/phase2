package com.handler;

import javax.security.auth.Subject;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Class1;
import com.entity.Student;
import com.entity.Sub1;
import com.entity.Teacher;
import com.entity.User;
import com.utility.HibernateUtility;

public class UserHandler {
	
	
	
	public void addUser(User user) {
		Session session= HibernateUtility.getSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(user);
		
		tx.commit();
	}

	public void addStudent(Student s) {
Session session= HibernateUtility.getSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(s);
		
		tx.commit();
		
	}

	public void addSubject(Sub1 s) {
		
Session session= HibernateUtility.getSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(s);
		
		tx.commit();
	}

	public void addTeacher(Teacher t) {
Session session= HibernateUtility.getSession();
		
		Transaction tx= session.beginTransaction();
		
		session.save(t);
		
		tx.commit();
		
	}

	public void Class(Class1 c) {
		// TODO Auto-generated method stub
		
	}

}
