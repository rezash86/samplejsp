<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<table border="1" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>name</th>
			<th>phone number</th>
			<th>email</th>
		</tr>
		
		<c:forEach items="${customers}" var="customer">
			<tr>
				<td>${customer.id}</td>
				<td>${customer.name}</td>
				<td>${customer.tel}</td>
				<td>${customer.address}</td>
				<td><a href="edit?id=${customer.id}">EDITT</a></td>
   
			</tr>
		
		</c:forEach>
		
	</table>
</body>
</div>
</html>