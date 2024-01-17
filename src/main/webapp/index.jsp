<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
	</head>
	<body>
		<form action="ValidadorServlet" method="POST">
				Usuario: <input type="text" name="username"/><br/>
				Contraseña: <input type="password" name="password"/><br/>
			<input type="submit" value="Enviar" name="Enviar"/>
		</form>
	</body>
</html>
