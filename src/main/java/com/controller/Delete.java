package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.Emp;
import com.dao.EmpDao;
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   if (1==EmpDao.delete(Integer.parseInt(request.getParameter("id")))) {
		RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 List<Emp> emps=EmpDao.getall();
	     response.setContentType("text/html");
	     PrintWriter printWriter=response.getWriter();
	     for (Emp emp : emps) {
			printWriter.print("<h1>"+emp.getId()+" "+emp.getName()+"</h1><br>");
		}
	     printWriter.print("<form action='Delete1' method='post'>"
					+ "   <input type='number' name='id'>"
					+ "   <input type='submit' value='Delete'>"
					+ "</form>");
			
		
	
	}

}
