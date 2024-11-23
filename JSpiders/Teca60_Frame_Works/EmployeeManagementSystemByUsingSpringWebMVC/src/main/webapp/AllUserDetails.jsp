<%@page import="org.jsp.model.UserInformation"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style >
*{
margin:0px;
padding:0px;
background-color:teal;
color:salmon;

}
input:text{
color:black;
}}
</style>
</head>
<body>
	<!-- Search Bar Form -->
	<center>
		<h1>All User Details</h1>
		<form action="filter" method="get">
			<input type="text" name="filtervalue"
				placeholder="Search by name, email, mobile,Gender address">
			<input type="submit" value="Search">
		</form>
	</center>
	<br>

	<!-- Display all user details -->


	<%
	List<UserInformation> list = (List<UserInformation>) request.getAttribute("alluserdetails");
	%>

	<center>

		<table border=1>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email id</th>
				<th>Mobile Number</th>
				<th>gender</th>
				<th>Address</th>
			</tr>
			<tr>
				<%
				for (UserInformation user : list) {
				%>
				<td><%=user.getFirstname()%></td>
				<td><%=user.getLastname()%></td>
				<td><%=user.getEmailid()%></td>

				<%
				String ph = user.getMobilenumber() + "";
				%>
				<td><%=ph.substring(0, 3) + "****" + ph.substring(7, 10)%></td>
				<td><%=user.getGender()%></td>
				<td><%=user.getAddress()%></td>
				<form action="update">
					<td><input type="submit" value="Update"></td>
				</form>
				<form action="delete">

					<td><input type="text" value="<%=user.getEmailid()%>"
						name="email" hidden></td>
					<td><input type="submit" value="Delete"></td>
				</form>
			</tr>
			<%
			}
			%>

		</table>
	</center>

</body>
</html>