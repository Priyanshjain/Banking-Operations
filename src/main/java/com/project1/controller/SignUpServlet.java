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
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger("SignUpServlet");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
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
		String signUpcustomerName = request.getParameter("customerName");
		String signUppasswordC = request.getParameter("password");
		int signUpbalance = Integer.parseInt(request.getParameter("balance"));
		String signUpmobileNumber = request.getParameter("mobileNumber");
		String signUpemailId = request.getParameter("emailId");
		
		int signUpcustomerId=(int) (100+Math.random()*900);
		Customer signUpcustomer = new Customer(signUpcustomerId , signUppasswordC, signUpcustomerName, signUpbalance, signUpmobileNumber, signUpemailId, new Date());
		
		CustomerService customerService = new CustomerServiceImpl(); 
		customerService.addCustomer(signUpcustomer);
		
		HttpSession session = request.getSession();
		session.setAttribute("signUpcustomerName", signUpcustomerName);
		session.setAttribute("signUpcustomerId", signUpcustomerId);
		session.setAttribute("signUppasswordC", signUppasswordC);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("SignupCustomerDetails.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
