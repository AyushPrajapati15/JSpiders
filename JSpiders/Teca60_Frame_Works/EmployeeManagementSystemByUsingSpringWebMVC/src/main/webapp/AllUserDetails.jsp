<%@page import="org.jsp.model.UserInformation"%>
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
<%
	List<UserInformation> list=	
	(List<UserInformation>) request.getAttribute("alluserDetails");
%>

<center>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email id</th>
<th>gender</th>
<th>Address</th>
</tr>
<tr>
<%for(UserInformation user:list) 
{%>
<td><%=user.getFirstname() %></td>
<td><%=user.getLastname() %></td>
<td><%=user.getEmailid() %></td>
<td><%=user.getGender() %></td>
<td><%=user.getAddress() %></td>
</tr>
<%} %>

</table>
</center>

</body>
</html>