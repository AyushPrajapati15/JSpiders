<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.example.entity.Employee"%>
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
<% List<Employee> list=(List<Employee>)request.getAttribute("allemployeedetails"); %>

<center>

<table border=1>

<tr>
<th>Employee id</th>
<th>Employee name</th>
<th>Employee email</th>
<th>Employee password</th>
<th>Employee sal</th>
<th>Employee dept no</th>
</tr>

<tr>



<%for(Employee emp:list) { %>

<td><%=emp.getEmployeeid() %></td>
<td><%=emp.getEmployeename() %></td>
<td><%=emp.getEmployeemail() %></td>
<td><%=emp.getEmployeepassword() %></td>
<td><%=emp.getEmployeesal() %></td>
<td><%=emp.getEmployeedeptno() %></td>


</tr>
<%} %>
</table>
</center>


</body>
</html>