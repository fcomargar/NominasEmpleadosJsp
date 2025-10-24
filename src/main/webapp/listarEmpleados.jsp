<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Lista de Empleados</title>

    <style>
        body {font-family: Arial, sans-serif; margin: 2rem; text-align: center; display: flex;flex-direction: column; justify-items: center}
        .error { color: red; margin-bottom: 1rem;}
        .volver { margin-top: 1rem;}
    </style>
</head>
<body>
<h1>Empleados</h1>

<c:if test="${not empty error}">
    <div class="error">${error}</div>
</c:if>

<table border="Solid black 1px">
    <thead>
    <tr>
        <th>DNI</th>
        <th>Nombre</th>
        <th>Sexo</th>
        <th>Categoría</th>
        <th>Años</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${empleados}" var="emp">
        <tr>
            <td>${emp.dni}</td>
            <td>${emp.nombre}</td>
            <td>${emp.sexo}</td>
            <td>${emp.categoria}</td>
            <td>${emp.anyos}</td>
        </tr>
    </c:forEach>
    <c:if test="${empty empleados}">
        <tr>
            <td colspan="5">No se encontraron empleados.</td>
        </tr>
    </c:if>
    </tbody>
</table>
    <div class="volver">
        <a href="<c:url value='/'/>">Volver</a>
    </div>
</body>
</html>