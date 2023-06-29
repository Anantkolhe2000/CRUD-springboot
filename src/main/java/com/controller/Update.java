package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Emp;
import com.dao.EmpDao;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     List<Emp> list=EmpDao.getall();
     response.setContentType("text/html");
     PrintWriter printWriter=response.getWriter();
     
	for (Emp emp : list) {
		printWriter.print("<h2>"+emp.getId()+"  "+emp.getName()+"</h2>");
	}
	printWriter.print("<form action='Update1' method='post'>"
			+ "   <input type='number' name='id'>"
			+ "   <input type='number' name='updatedid' placeholder='updated id'>"
			+ "   <input type='text' name='name'> "
			+ "   <input type='submit' value='update'>"
			+ "</form>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<Emp> list=EmpDao.getall();
	     response.setContentType("text/html");
	     PrintWriter printWriter=response.getWriter();
	     
		for (Emp emp : list) {
			printWriter.print("<h2>"+emp.getId()+"  "+emp.getName()+"</h2>");
		}
		printWriter.print("<form action='Update1' method='post'>"
				+ "   <input type='number' name='id'>"
				+ "   <input type='number' name='updatedid' placeholder='updated id'>"
				+ "   <input type='text' name='name'> "
				+ "   <input type='submit' value='update'>"
				+ "</form>");
		
	}



}
