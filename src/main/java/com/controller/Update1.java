package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;

/**
 * Servlet implementation class Update1
 */
@WebServlet("/Update1")
public class Update1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Update1() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		response.setContentType("text/html");
	   PrintWriter printWriter=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		int updatedid=Integer.parseInt(request.getParameter("updatedid"));
		String name=request.getParameter("name");
		if(1==EmpDao.update(id, name, updatedid)) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("Update");
			dispatcher.forward(request, response);
		}
		
	}

}
