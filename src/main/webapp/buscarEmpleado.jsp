<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Buscar un Empleado</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 2rem; text-align: center; display: flex; flex-direction: column;}
        h1 {}
        form { display: flex; flex-direction: column; max-width: 500px; margin: 5px auto;}
        label {}
        input[type=text]{}
        input[type=submit]{}
        .volver {margin-top: 1rem; text-align: center;}
        .categoria {width: 50px;}
    </style>
</head>
<body>

<h1>Buscar un Empleado</h1>
<form action="buscarEmpleado" method="post">
    <label for="dni">Dni:</label>
    <input type="text" name="dni" id="dni" />
    <label for="nombre">Nombre:</label>
    <input type="text" name="nombre" id="nombre" />
    <label for="nombre">Sexo:</label>
    <label>
        <label for="nombre">Masculino:</label>
        <input type="radio" name="Sexo" value="M">
        <label for="nombre">Femenino:</label>
        <input type="radio" name="Sexo" value="F">
    </label>
    <label for="categoria">Categoría</label>
    <input type="number" name="categoria" id="categoria" class="categoria"/>
    <input type="submit" value="Buscar" />

</form>
<div class="volver">
    <a href="index.jsp">Volver</a>
</div>

</body>
</html>
