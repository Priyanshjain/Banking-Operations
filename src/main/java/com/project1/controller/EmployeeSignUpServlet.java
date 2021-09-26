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
import com.project1.model.Employee;
import com.project1.service.CustomerService;
import com.project1.service.CustomerServiceImpl;
import com.project1.service.EmployeeService;
import com.project1.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeSignUpServlet
 */
public class EmployeeSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger("EmployeeSignUpServlet");
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSignUpServlet() {
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
		String signUpemployeeName = request.getParameter("employeeName");
		String signUppassword = request.getParameter("password");
		String signUpmobileNumber = request.getParameter("mobileNumber");
		String signUpemailId = request.getParameter("emailId");
		
		
		int signUpemployeeId=(int) (100+Math.random()*900);
		Employee signUpemployee = new Employee(signUpemployeeId, signUpemployeeName, signUppassword, signUpmobileNumber, signUpemailId, new Date());
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		employeeService.addEmployee(signUpemployee);
		
		HttpSession session = request.getSession();
		session.setAttribute("signUpemployeeName", signUpemployeeName);
		session.setAttribute("signUpemployeeId", signUpemployeeId);
		session.setAttribute("signUppassword", signUppassword);
		RequestDispatcher dispatcher = request.getRequestDispatcher("SignupEmployeeDetails.jsp");
		dispatcher.forward(request, response);
//		response.sendRedirect("SignupEmployeeDetails.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
