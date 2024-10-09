<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int num = 153;
	int temp = num;
	int count = 0;
	int ans = 1;
	int res = 0;%>
	<%
	while (temp != 0) {
		count++;
		temp /= 10;
	}

	temp = num;//153

	while (temp != 0) {
		int n = temp % 10;
		ans=0;
		for (int i = 1; i <= count; i++) {
			ans *= n;

		}
		temp /= 10;
		res += ans;
	}

	if (num == res) {
	%>
	<%=num + " is Armstrong number"%>

	<%
	} else {
	%>
	<%=num + " Is not an armstrong number"%>
	<%
	}
	%>



</body>
</html>