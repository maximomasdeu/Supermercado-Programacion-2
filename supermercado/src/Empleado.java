public class Empleado extends Humano{
    private double sueldo;

    public Empleado(String nombre, String apellido, int dni){
       super(nombre, apellido, dni);
       this.sueldo = sueldo;
    }

    public Empleado() {
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return super.toString() + "Sueldo: " + this.sueldo;
    }

}
