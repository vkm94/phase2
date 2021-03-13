package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.entity.User;
import com.handler.UserHandler;


@WebServlet("/AddStudents")
public class AddStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Student s= new Student(request.getParameter("uname"), request.getParameter("email"), request.getParameter("city"));
		
		UserHandler uh= new UserHandler();
		uh.addStudent(s);
		
		//RequestDispatcher rd= request.getRequestDispatcher("usersuccess.jsp");
		//rd.forward(request, response);
	}

}
