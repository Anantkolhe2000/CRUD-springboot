<%@page import="com.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <%
       int id=Integer.parseInt(request.getParameter("id"));
       String name=request.getParameter("name");
      int updatedid=Integer.parseInt(request.getParameter("updatedid"));
       if(1==EmpDao.update(id, name, updatedid)){
    	   RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
          dispatcher.forward(request, response);
       };
      %>
</body>
</html>