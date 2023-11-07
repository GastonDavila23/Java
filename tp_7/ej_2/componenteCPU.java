package ej_2;

public class componenteCPU {
    String componente;
    String marca;
    int cantidad;
    double precio;
    public componenteCPU(String componente, String marca, int cantidad, double precio){
        this.componente = componente;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public String toString() {
        return this.componente + " " + this.marca + " " + this.cantidad + " " + this.precio + " " + (this.cantidad * this.precio);
    }
}
