package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.entity.User;
import com.handler.UserHandler;

 
@WebServlet("/UserApp")
public class UserApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		User user= new User(request.getParameter("uname"), request.getParameter("pass"), request.getParameter("email"), request.getParameter("city"));
		
		UserHandler uh= new UserHandler();
		uh.addUser(user);
		
		RequestDispatcher rd= request.getRequestDispatcher("usersuccess.jsp");
		rd.forward(request, response);
		
		
	}

}
