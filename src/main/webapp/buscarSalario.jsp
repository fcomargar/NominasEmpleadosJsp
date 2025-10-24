<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Buscar salario de empleado</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 2rem; text-align: center;}
        h1 {}
        form {}
        label {}
        input[type=text]{}
        input[type=submit]{}
        .volver {margin-top: 1rem; text-align: center;}
    </style>
</head>
<body>
<h1>Mostrar salario de un empleado</h1>
<form action="mostrarSalario" method="get">
    <label for="dni">DNI del empleado:</label>
    <input type="text" id="dni" name="dni" placeholder="Introduce el DNI" required>
    <input type="submit" value="Consultar salario">
</form>

<div class="volver">
    <a href="<c:url value='/'/>">Volver</a>
</div>
</body>
</html>