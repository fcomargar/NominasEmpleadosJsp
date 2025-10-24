package servlet;

import Laboral.DBUtil;

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


@WebServlet(name = "MostrarSalarioServlet", urlPatterns = "/mostrarSalario")
public class MostrarSalarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dni");
        String error = null;
        Integer salario = null;

        if (dni == null || dni.trim().isEmpty()) {
            error = "Debes proporcionar DNI correcto.";
        } else {
            try (Connection conn = DBUtil.getConnection();
                 PreparedStatement ps = conn.prepareStatement(
                         "SELECT sueldo FROM Nominas WHERE dni = ?")) {
                ps.setString(1, dni.trim());
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        salario = rs.getInt("sueldo");
                    } else {
                        error = "No existe ninguna nómina con ese DNI.";
                    }
                }
            } catch (SQLException ex) {
                error = "Error al consultar la base de datos: " + ex.getMessage();
            }
        }

        if (error != null) {
            request.setAttribute("error", error);
        }
        if (salario != null) {
            request.setAttribute("salario", salario);
        }
        request.setAttribute("dni", dni);
        request.getRequestDispatcher("/mostrarSalario.jsp").forward(request, response);
    }

    // También aceptamos peticiones POST para que el formulario pueda usar ambos métodos
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}