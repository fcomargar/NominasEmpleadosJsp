package servlet;

import Laboral.DBUtil;
import Laboral.DatosNoCorrectosException;
import Laboral.Empleado;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "MostrarEmpleadosServlet", urlPatterns = "/mostrarEmpleados")
public class MostrarEmpleadosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Empleado> empleados = new ArrayList<>();
        String error = null;

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "SELECT dni, nombre, sexo, categoria, anyos FROM Empleados");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                char sexo = rs.getString("sexo").charAt(0);
                int categoria = rs.getInt("categoria");
                int anyos = rs.getInt("anyos");
                try {
                    Empleado emp = new Empleado(nombre, dni, sexo, categoria, anyos);
                    empleados.add(emp);
                } catch (DatosNoCorrectosException ex) {
                    // Si los datos en la base de datos no son validos lo añadimos como error
                    error = "Error en datos de empleado: " + ex.getMessage();
                }
            }
        } catch (SQLException e) {
            error = "Error al consultar la base de datos: " + e.getMessage();
        }

        request.setAttribute("empleados", empleados);
        if (error != null) {
            request.setAttribute("error", error);
        }
        // Reenvio a la página
        request.getRequestDispatcher("/listarEmpleados.jsp").forward(request, response);
    }
}