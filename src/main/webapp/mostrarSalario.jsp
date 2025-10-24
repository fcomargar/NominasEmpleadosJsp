<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Resultado del salario</title>
    <style>
        body {font-family: Arial, sans-serif;}
        h1 { text-align: center; }
        .mensaje {}
        .error { color: red; }
        .volver {}
    </style>
</head>
<body>
<h1>Resultado de la consulta</h1>

<c:if test="${not empty error}">
    <div class="mensaje error">${error}</div>
</c:if>

<c:if test="${not empty salario}">
    <div class="mensaje">El sueldo del empleado con DNI <strong>${dni}</strong> es: <strong>${salario}</strong> euros.</div>
</c:if>

<div class="volver">

    <a href="buscarSalario.jsp">Consultar otro DNI</a> | <a href="<c:url value='/'/>">Volver al inicio</a>
</div>
</body>
</html>