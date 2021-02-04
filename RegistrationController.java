package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.demo.DelegatesImpl.RegistrationDelegatesImpl;
import com.nacre.demo.vo.RegistrationVO;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/Registration")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	//creating local variable
		String fname=null;
		String lname=null;
		String age=null;
		String dob=null;
		String gender=null;
		String per=null;
		boolean registrationCheck=false;
		RegistrationVO registrationVO=null;
		RegistrationDelegatesImpl registrationDelegatesImpl=null;				
		
	//accepting request values from UI
		fname=request.getParameter("fname");
		lname=request.getParameter("lname");
		gender=request.getParameter("gender");
		dob=request.getParameter("dob");
		age=request.getParameter("age");
		per=request.getParameter("per");
		
	//creating registrationVO object
		registrationVO=new RegistrationVO();
		
	//setting values 
		registrationVO.setFname(fname);
		registrationVO.setLname(lname);
		registrationVO.setAge(age);
		registrationVO.setDob(dob);
		registrationVO.setGender(gender);
		registrationVO.setPer(per);
		
	//creating RegistrationDelegatesImpl object and calling parse method
		 registrationDelegatesImpl=new RegistrationDelegatesImpl();
		 registrationCheck=registrationDelegatesImpl.parse(registrationVO);
		 
	 //if parse method of RegistrationDelegatesImpl will true it will give true otherwise false 
		 if(registrationCheck){
			 out.print("<h1>Successful</h1>");
		 }else{
			 out.print("<h1>Failed</h1>");
		 }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
	}
	}


