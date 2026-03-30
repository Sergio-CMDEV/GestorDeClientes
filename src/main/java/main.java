import dao.EmpleadoDAO;
import model.Empleado;
import model.Cliente;
import dao.ClienteDAO;
import database.ConexionDB;
//import gui.VentanaPrincipal;

public class main {
    public static void main(String[] args) {
        ConexionDB.obtenerConexion();
        //VentanaPrincipal ventana = new VentanaPrincipal();
        //ventana.setVisible(true);

        //Empleado nuevo = new Empleado("Juan", "Pérez", "juan@mail.com", "555-123", 1800.0, "Camarero");
        //EmpleadoDAO dao = new EmpleadoDAO();
        //Cliente nuevo = new Cliente("Alfredo", "Fernandez", "alfredo@mail.com", "321-677");
        //ClienteDAO dao = new ClienteDAO();

        /*if (dao.insertar(nuevo)) {
            System.out.println("Empleado insertado correctamente");
        } else {
            System.out.println("Error al insertar empleado");
        }*/
    }
}
