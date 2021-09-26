package com.project1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project1.service.CustomerService;
import com.project1.service.CustomerServiceImpl;

/**
 * Servlet implementation class WithdarwAmountServlet
 */
public class WithdarwAmountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdarwAmountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int  customerid = Integer.parseInt(request.getParameter("customerid"));
		
		HttpSession session = request.getSession();
		Integer SignIncustomerid = (Integer)session.getAttribute("SignIncustomerid");
		int Withdrawamount = Integer.parseInt(request.getParameter("amount"));
		session.setAttribute("Withdrawamount", Withdrawamount);	

		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<body style='background-color:lightgreen;'>");
		
		CustomerService customerService=new CustomerServiceImpl();
		customerService.withdraw(SignIncustomerid, Withdrawamount);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WithdrawAmount.jsp");
		dispatcher.forward(request, response);
		
//		 out.println("<a href=Withdraw.html>Back</a>");
//	     out.println("<h2 align=center>Customer with ID"+" "+customerid);
//	     out.println("<h3 align=center>Amount:"+"  "+amount+" "+"Successfully Withdrawl from your Account");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
