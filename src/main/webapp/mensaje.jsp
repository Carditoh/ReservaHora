<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<% String msg=(String)request.getAttribute("mensaje"); if(msg==null){msg="";} %>
		<p><a href="/ReservaHora/agregarDuenho.jsp">Dueño</a></p><br/>
		<p><a href="/ReservaHora/agregarMascota.jsp">Mascota</a></p><br/>
		<p><a href="/ReservaHora/agregarAgenda.jsp">Agendamiento</a></p>
	</body>
</html>