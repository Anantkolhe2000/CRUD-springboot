<%@page import="com.dao.EmpDao"%>
<%@page import="com.dao.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>show all Records</h1>
<table border="1">
  <tr> <th>ID</th> <th>Name</th> <th>update</th> <th>Delete</th></tr> 
  <% 
  List<Emp> emps=EmpDao.getall();
for(Emp emp:emps){
  out.print("<tr><td>"+emp.getId()+"</td><td>"+emp.getName()+"<td><a href='preupdate.jsp?id="+emp.getId()+"&name="+emp.getName()+"'>update</a></td><td><a href='Delete?id="+emp.getId()+"' >Delete</a></td> </tr>");
}
%>
</table>
<form action="Save" method="get">
<input type="number" name="id">
<input type="text" name="name">
<input type="submit" value="save"> 
</form>
<a href="Update">Update</a>
<a href="Delete">Delete</a>

</body>
</html>