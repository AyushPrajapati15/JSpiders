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
<h1>Employee Registration</h1>
 <form action="employeeregistration" method="post">
            <label>Employee ID:</label>
            <input type="text" id="employeeid" name="employeeid"><br><br>

            <label>Employee Name:</label>
            <input type="text" id="employeename" name="employeename"><br><br>
            
            <label>Employee E-mail:</label>
            <input type="text" id="employeemail" name="employeemail"><br><br>
            
            <label>Employee Password:</label>
            <input type="text" id="employeepassword" name="employeepassword"><br><br>

            <label>Employee Salary:</label>
            <input type="text" id="employeesal" name="employeesal"><br><br>

            <label>Department Number:</label>
            <input type="text" id="employeedeptno" name="employeedeptno"><br><br>

            <input type="submit" value="Submit">
        </form>
</center>
</body>
</html>