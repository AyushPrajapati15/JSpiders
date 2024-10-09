<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-image: radial-gradient(circle at top right, blue, red);
}
</style>
</head>
<body>
	<center>
		<h1>Admin Login</h1>
		<form action="adminlogin" method="post">
			<label>Email-id:</label> <input type="email" id="adminmail"
				name="adminmail"><br>
			<br> <label>Password:</label> <input type="text"
				id="adminpassword" name="adminpassword"><br>
			<br> <input type="submit" value="Submit">
		</form>
	</center>

</body>
</html>