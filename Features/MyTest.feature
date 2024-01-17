Feature: Realizacion de casos ingresando nombre de usuario y contraseña

Scenario: Verificacion de ingreso de sesion con datos erroneos
Given abrir Chrome
When ingresa Username "admin" y Password "user"
Then inicia sesion

Scenario: Verificacion de ingreso de sesion
Given abrir Chrome
When ingresa Username "admin" y Password "admin"
Then inicia sesion

Scenario: Registro de hora medica veterinaria
Given ir al formulario
When llenar campos "2", "2-4", "Jody", "1230" y "11111111"
Then presionar boton