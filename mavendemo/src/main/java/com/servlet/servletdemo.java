package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Trainee;
import com.traineeDao.TraineeDaoimp;


public class servletdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    TraineeDaoimp traineedaoimp = new TraineeDaoimp(); 
    public servletdemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * }
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String dob = request.getParameter("dob");
	
		Trainee tr = new Trainee();
		tr.setName(name);
		tr.setEmail(email);
		tr.setDob(dob);
		tr.setPhone(phone);
		traineedaoimp.createtrainee(tr);
		RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	
	}

}
