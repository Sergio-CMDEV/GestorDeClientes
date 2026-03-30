package dao;

import database.ConexionDB;
import model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    public boolean insertar(Cliente cln) {
        String sql = "INSERT INTO clientes (nombre, apellido, correo, telefono) VALUES (?, ?, ?, ?)";

        try (Connection con = ConexionDB.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cln.getNombre());
            ps.setString(2, cln.getApellido());
            ps.setString(3, cln.getCorreo());
            ps.setString(4, cln.getTelefono());
            int resultado = ps.executeUpdate();
            return (resultado > 0);
        } catch (SQLException e) {
            System.out.println("Error al insertar cliente: " + e.getMessage());
            return false;
        }
    }
}
