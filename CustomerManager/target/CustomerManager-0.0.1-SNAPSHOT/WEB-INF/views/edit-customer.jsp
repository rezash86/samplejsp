<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>Edit Customer</h2>
		<form action="save" method="post" modelAttribute="customer">

			<table>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>
			</table>


		</form>
</body>
</html>