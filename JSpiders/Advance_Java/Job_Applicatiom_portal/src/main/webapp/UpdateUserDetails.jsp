<%@page import="com.jsp.model.UserInformation"%>
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
UserInformation information= (UserInformation) session.getAttribute("userbyid");
%>
<center>
<form  action="updateuser">
<input value="<%=information.getId()%> " hidden="true"  name="userid">
<input value="<%=information.getFirst_Name()%> "  name="fname">
<br>
<input value="<%=information.getLast_Name()%>"name="lname">
<br>
<input value="<%=information.getEmail_Id()%>"name="mailid">
<br>
<input value="<%=information.getMobile_Number()%>"name="mb">
<br>
<input value="<%=information.getQualification()%>"name="qualifiation">
<br>
<input value="<%=information.getPercentage()%>"name="percentage">
<br>
<input type="Submit">
</form></center>


</body>
</html>