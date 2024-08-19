import java.util.List;

public class Transaccion{

    private List<Producto> listaProd;
    private int nroCaja;
    private Double precioTotal;

    public Transaccion() {
    }

    // Constructor con parámetros
    public Transaccion(List<Producto> listaProd, int nroCaja, Double precioTotal) {
        this.listaProd = listaProd;
        this.nroCaja = nroCaja;
        this.precioTotal = precioTotal;
    }

    // Getters y Setters
    public List<Producto> getListaProd() {
        return listaProd;
    }

    public void setListaProd(List<Producto> listaProd) {
        this.listaProd = listaProd;
    }

    public int getNroCaja() {
        return nroCaja;
    }

    public void setNroCaja(int nroCaja) {
        this.nroCaja = nroCaja;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal() {

        this.precioTotal = 0.0;
        for (Producto prod: listaProd) {

            this.precioTotal = precioTotal+prod.getPrecio();


        }


    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "listaProd=" + listaProd +
                ", nroCaja=" + nroCaja +
                ", precioTotal= $" + precioTotal +
                '}';
    }




}
