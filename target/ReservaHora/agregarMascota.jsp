<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<form action="MascotaServlet" method="POST">
			Rut del Dueño: <input type="text" name="rutDuenho"/><br/>
			Tipo de Mascota: <input type="text" name="tipoMascota"/><br/>
			Edad: <input type="text" name="edad"/><br/>
			Nombre de la mascota: <input type="text" name="nombreMascota"/><br/>
			<input type="submit" value="Enviar" name="Enviar"/>
		</form><br/><br/>
		
		<p> <%= request.getAttribute("mensaje")%> </p>
	</body>
</html>