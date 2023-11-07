package ej_2;

public class Ingredientes {

    private String nombre;
    private Double cantidad;
    private String cantidad_medida;

    public Ingredientes() {
    }

    public Ingredientes(String nombre, Double cantidad, String cantidad_medida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cantidad_medida = cantidad_medida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad_medida(String cantidad_medida) {
        this.cantidad_medida = cantidad_medida;
    }

    public String getCantidad_medida() {
        return cantidad_medida;
    }

    @Override
    public String toString() {
        return "Ingredientes{" + "nombre='" + nombre + '\'' + ", cantidad=" + cantidad + ", cantidad_medida='" + cantidad_medida + '\'' + '}';
    }
}
