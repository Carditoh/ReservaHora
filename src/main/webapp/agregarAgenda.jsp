<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<form action="AgendaServlet" method="POST">
			ID de la Mascota: <input type="text" name="idMascota"/><br/>
			Rut del Dueño: <input type="text" name="rutDuenho"/><br/>
			Nombre de la Mascota: <input type="text" name="nombreMascota"/><br/>
			Hora: <input type="time" name="hora"/><br/>
			Fecha: <input type="date" name="fecha"/><br/>
			<input type="submit" value="Enviar" name="Enviar"/>
		</form><br/><br/>
		
	</body>
		<p> <!--<%= request.getAttribute("mensaje")%>--> </p>
</html>