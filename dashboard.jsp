<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.nav {
	background-color: beige;
	list-style-type: none;
	text-align: center;
	margin: 0;
	padding: 0;
}

.nav li {
	display: inline-block;
	font-size: 20px;
	padding: 20px;
	color: blueviolet;
}

h1 {
	color: brown;
	scrollbar-width: 20px;
	align-items: center;
	text-align: center;
	margin: auto;
	padding: 10px;
}
</style>
</head>


<body>
<Form action="http://localhost:8080/WebApplication/dashboardservlet" method="post">
	<h1>Welcome to Payments Web</h1>
	<ul class="nav">

		<li><a href="addbankacc.jsp">Add Bank Account1</a></li>
		<li><a href="addbankacc.jsp">Add Bank Account2</a></li>
		<li><a href="addbankacc.jsp">Add Bank Account3</a></li>
		<li><a href="addbankacc.jsp">Add Bank Account4</a></li>
	</ul>
	<a href="addbankacc.jsp">Edit</a>
	</Form>
	<form action= "http://localhost:8080/WebApplication/logoutservlet" method="post">
	 <button type="submit">Logout</button>
	 <a href="logout.jsp"></a>
	 <Form action="http://localhost:8080/WebApplication/addbankacc" method="post">
	 <button type="submit">See Account</button>
	 
	
	</form>

</body>
</html>