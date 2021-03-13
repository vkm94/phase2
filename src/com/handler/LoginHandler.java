package com.handler;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.User;
import com.utility.HibernateUtility;

public class LoginHandler {
	public boolean validate(User user) {
		Session session= HibernateUtility.getSession();
		
		Transaction tx= session.beginTransaction();
		Query query= session.createQuery("from myuser ");
		tx.commit();
		List<User> lst= query.list();
		lst.add(user);
	
		if(user.getUname().equals(lst.contains("uname")) && user.getPassword().equals(lst.contains("password") )) {
			return true;
		}
		
		  
		return false;
	}
}
