package com.project1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.project1.model.Customer;
import com.project1.service.CustomerService;
import com.project1.service.CustomerServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger("LoginServlet");   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int  SignIncustomerid = Integer.parseInt(request.getParameter("customerid"));
		String SignInCustomerpassword = request.getParameter("password");
		
		/*
		 * response.setContentType("text/html"); PrintWriter out = response.getWriter();
		 * out.println("<body style='background-color:lightgreen;'>");
		 */
		
		HttpSession session = request.getSession();
		session.setAttribute("SignIncustomerid", SignIncustomerid);
		session.setAttribute("SignInCustomerpassword", SignInCustomerpassword);
		
		CustomerService customerService=new CustomerServiceImpl();
		if(customerService.login(SignIncustomerid, SignInCustomerpassword))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("UserHome.html");
			dispatcher.forward(request, response);
		}
		else {
			response.sendRedirect("IncorrectLogin.html");
		}

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
