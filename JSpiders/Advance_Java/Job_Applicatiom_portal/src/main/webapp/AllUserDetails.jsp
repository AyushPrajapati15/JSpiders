<%@page import="org.apache.catalina.User"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.model.UserInformation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<style>
* {
	margin: 0;
	padding: 0;
}

table {
	border: 2px solid black;
	box-shadow: 10px 10px 10px black;
	border-collapse: collapse;
}

div {
	background-color: black;
	color: grey;
	height: 60px;
	font-size: 10px;
	display: flex;
	align-items: center;
}

.table {
	width: 100%;
	height: 200px;
	background-color: lightgrey;
	font-size: 25px;
}
</style>
</head>
<body>
	<%
	String name = (String) session.getAttribute("name");
	%>
	<div>
		<h1><%="hello " + name%></h1>
	</div>
	<center>
		<table border=1 class="table">
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>EmailId</th>
				<th>Mobile Number</th>
				<th>Qualification</th>
				<th>Percentage</th>
				<th>Gender</th>
			</tr>

			<%
			List<UserInformation> list = (List<UserInformation>) session.getAttribute("userInformation");

			for (UserInformation information : list) {
			%>
			<tr>
				<td><%=information.getFirst_Name()%></td>
				<td><%=information.getLast_Name()%></td>
				<td><%=information.getEmail_Id()%></td>
				<td><%=information.getMobile_Number()%></td>
				<td><%=information.getQualification()%></td>
				<td><%=information.getPercentage()%></td>
				<td><%=information.getGender()%></td>
				<td>
					<form class="input" action="selectuserdetails">
						<input value="<%=information.getId()%>" hidden name="userid"> 
						<input type="submit" value="Update">
					</form>
					</td>
					<td>
					<form>
						<input type="submit" value="Delete">
					</form>
				</td>
			</tr>

			<%
			}
			%>
		</table>
	</center>
</body>
</html>






