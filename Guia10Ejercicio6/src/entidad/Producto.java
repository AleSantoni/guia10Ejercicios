package entidad;
/*
/**
 *.
 */
public class Producto {
    private String nombreProducto;
    private double precio;
    public Producto() {

    }
    public Producto(String nombreProducto, double precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
