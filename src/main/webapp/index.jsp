<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Aplicación de Nóminas</title>
    <style>
        body{font-family: sans-serif; margin: 2rem;}
        *{text-align: center;}
        ul{list-style-type: none; padding: 0; max-width: 400px; margin: 0 auto;}
        a{text-decoration: none; font-weight: bold; color: black}
        a:hover{text-decoration: underline;}
    </style>
</head>
<body>
<h1>Gestión de Nóminas</h1>
<p>Selecciona una opción:</p>
<ul>
    <li><a href="<c:url value='/mostrarEmpleados'/>">Mostrar todos los empleados</a></li>
    <li><a href="<c:url value='buscarSalario.jsp'/>">Mostrar Salaraio de un Empleado</a></li>
    <li><a href="<c:url value='buscarEmpleado.jsp'/>">Modificar datos de un Empleado</a></li>
</ul>
</body>
</html>