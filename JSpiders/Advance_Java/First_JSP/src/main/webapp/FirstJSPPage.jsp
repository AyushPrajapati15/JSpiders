<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int a=10;
public String checkEvenOdd()
{
if(a%2==0)
{
return a+ " is even number";
}
else{
	return a+  " is odd number";
}

}%>
<center style="color:red;font-size:50px">
<%=
checkEvenOdd()
%>
</center>

<%
int a=13;
if(a%2==0)
{%>
<h1><%= a +" is even number" %></h1>
<%
}

else
{
	%>
	
	<%=a+" is odd number" %>
	<%
}
%>


</body>
</html>




