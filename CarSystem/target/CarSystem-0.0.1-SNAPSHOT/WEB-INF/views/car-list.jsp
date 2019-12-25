<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table border="2">
			<c:forEach items="${cars}" var="car">
				<tr>
					<td>${car.name}</td>

				</tr>
				<tr>
					<td><a href="edit?carid=${car.id}">edit the name</a></td>

				</tr>
			</c:forEach>
		</table>
	</div>

	<div align="center">
		<h2>Add a car</h2>
		<form:form action="save" method="post" modelAttribute="car">

			<table border="0" cellpadding="5">
				<tr>
					
					<td><form:hidden path="id" />
					</td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>year:</td>
					<td><form:input path="year" /></td>
				</tr>
				<tr>
					<td>Colors</td>
					<td><form:select path="color">
							<option>Red</option>
							<option>Blue</option>
							<option>Green</option>
						</form:select></td>
				</tr>

				<tr>
					<td>used?</td>
					<td><form:checkbox path="new" />
				</tr>

				<tr>
					<td>door type</td>
					<td><form:radiobutton path="doorType" value="1" /> <form:radiobutton
							path="doorType" value="2" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>
			</table>


		</form:form>
	</div>


</body>
</html>