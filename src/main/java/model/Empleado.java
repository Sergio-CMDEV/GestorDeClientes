package model;

public class Empleado extends Persona {
    private String puesto;
    private Double salario;

    public Empleado(String nombre, String apellido, String correo, String telefono, double salario, String puesto) {
        super(nombre, apellido, correo, telefono);
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
