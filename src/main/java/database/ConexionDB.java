package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionDB {
    public static Connection obtenerConexion() {
        Connection conexion = null;
        Properties props = new Properties();
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            props.load(fis);

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String pass = props.getProperty("db.pass");

            conexion = DriverManager.getConnection(url, user, pass);

            if (conexion != null) {
                System.out.println("Conexion establecida correctamente");
            }
        } catch (SQLException ex) {
            System.out.println("Error al conectar a la base de datos: " + ex.getMessage());
        } catch (IOException e) {
            System.out.println("No se encontro el archivo config.properties");
        }
        return conexion;
    }
}

