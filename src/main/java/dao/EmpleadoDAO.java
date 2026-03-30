package dao;

import model.Empleado;
import database.ConexionDB;
import java.sql.*;

public class EmpleadoDAO {
    public boolean insertar(Empleado emp) {
        String sql = "INSERT INTO empleados (nombre, apellido, correo, telefono, puesto, salario) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = ConexionDB.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getApellido());
            ps.setString(3, emp.getCorreo());
            ps.setString(4, emp.getTelefono());
            ps.setString(5, emp.getPuesto());
            ps.setDouble(6, emp.getSalario());
            int resultado = ps.executeUpdate();
            return (resultado > 0);
        } catch (SQLException e) {
            System.out.println("Error al insertar empleado: " + e.getMessage());
            return false;
        }
    }
}
