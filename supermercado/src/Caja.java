public class Caja {

    private Empleado emple;
    private int nroCaja;

    public Caja(Empleado emple, int nroCaja) {
        this.emple = emple;
        this.nroCaja = nroCaja;
    }

    public Empleado getEmple() {
        return emple;
    }

    public void setEmple(Empleado emple) {
        this.emple = emple;
    }

    public int getNroCaja() {
        return nroCaja;
    }

    public void setNroCaja(int nroCaja) {
        this.nroCaja = nroCaja;
    }
    public String toString() {
        return this.emple.toString() + "\nNro de caja: " + this.nroCaja;
    }
}
