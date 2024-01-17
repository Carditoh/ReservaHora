<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<form action="DuenhoServlet" method="POST">
			Rut del Dueño: <input type="text" name="rut"/><br/>
			Nombre: <input type="text" name="nombre"/><br/>
			Apellido: <input type="text" name="apellido"/><br/>
			Dirección: <input type="text" name="direccion"/><br/>
			Correo Electronico: <input type="text" name="correo"/><br/>
			Teléfono: <input type="text" name="telefono"/><br/>
			Nombre de la mascota: <input type="text" name="nombreMascota"/><br/>
			<input type="submit" value="Enviar" name="Enviar"/>
		</form><br/><br/>
		
		<p> <%= request.getAttribute("mensaje")%> </p>
	</body>
</html>