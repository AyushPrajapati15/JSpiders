<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
        *{
            padding: 0px;
            margin: 0px;

        }
        input{
            cursor: pointer;
        }
        body{
            background-image: radial-gradient(circle at top right,blue,red);
        }
        .container{
            display: flex;
            align-items: center;
            justify-content: center;
            flex-direction: column;
            margin-top: 80px;
            
        }
        form{
            padding-top: 20px   ;

        }


    </style>
<body>
 <div class="container">

            <h1>EMPLOYEE REGISTRATION</h1>
            <form action="employeeregistrationpage">
                <input type="submit" value="Click Here For Employee Registration">
            </form><br>
            
            <h1>EMPLOYEE LOGIN</h1>
            <!-- <form action="employeeloginpage"> -->
            <form action="EmployeeLogin.jsp">
                <input type="submit" value="Click Here For Employee Login">
            </form><br>
            
            <h1>ADMIN REGISTRATION</h1>
            <form action="adminregistrationpage">
                <input type="submit" value="Click Here For Admin Registration">
        </form><br>
        
        <h1>ADMIN LOGIN</h1>
       <!-- <form action="adminloginpage"> --> 
        <form action="AdminLogin.jsp">
            <input type="submit" value="Click Here For Employee Login">
        </form><br>
    </div>
</body>
</html>