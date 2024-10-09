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
<h1>Admin Registration</h1>
 <form action="adminregistration" method="post">
           <!--  --> <label>Admin ID:</label>
            <input type="text" id="adminid" name="adminid"><br><br>

            <label>Admin Mail Id:</label>
            <input type="email" id="adminmail" name="adminmail"><br><br>

            <label>Admin Name:</label>
            <input type="text" id="adminnamel" name="adminname"><br><br>

            <label>Admin Password:</label>
            <input type="text" id="adminpassword" name="adminpassword"><br><br>

            <input type="submit" value="Submit">
        </form>
</center>
</body>
</html>