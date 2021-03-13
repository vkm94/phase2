package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.User;
import com.handler.LoginHandler;

@WebServlet("/LoginApp")
public class LoginApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginApp() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
User user= new User();
user.setUname(request.getParameter("uname"));
user.setPassword(request.getParameter("pass"));
		
		LoginHandler lh= new LoginHandler();
		if(lh.validate(user)) {
		HttpSession session=request.getSession();
		session.setAttribute("name",request.getParameter("uname"));
		response.sendRedirect("profile.jsp");
		
			}
		}

}
