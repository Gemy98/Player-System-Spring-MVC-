<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fo" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fifa Player</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

<h1>Hi Gemy</h1>



	<table class="table table-dark table-striped">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Name</th>
				<th scope="col">Number</th>
				<th scope="col">Address</th>
				<th scope="col">phone</th>
				<th scope="col">Services</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="player" items="${players}">
				<tr>
					<td>${player.id}</td>
					<td>${player.name}</td>
					<td>${player.number}</td>
					<td>${player.address}</td>
					<td>${player.phone}</td>
					<td>
					<c:url var ="editPlayer" value="/fifa/showplayer">
					<c:param name="playerId" value="${player.id}"></c:param>
					</c:url>
					<c:url var ="deletePlayer" value="/fifa/deleteplayer">
					<c:param name="playerId" value="${player.id}"></c:param>
					</c:url>
					
						<a href="${editPlayer}" type="button" class="btn btn-primary">Edit</a>
						<a href="${deletePlayer}" type="button" class="btn btn-danger">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add" type="button" class="btn btn-primary">Add player</a>

</body>
</html>