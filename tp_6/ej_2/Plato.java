package ej_2;

import java.util.ArrayList;

public class Plato {

    private String nombre_completo;
    private Double precio;
    private Boolean bebida;
    private ArrayList<Ingredientes> ingredientes;

    public Plato() {
    }

    public Plato(String nombre_completo, Double precio, Boolean bebida, ArrayList<Ingredientes> ingredientes) {
        this.nombre_completo = nombre_completo;
        this.precio = precio;
        this.bebida = bebida;
        this.ingredientes = ingredientes;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setBebida(Boolean bebida) {
        this.bebida = bebida;
    }

    public Boolean getBebida() {
        return bebida;
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Plato{" + "nombre_completo='" + nombre_completo + '\'' + ", precio=" + precio + ", bebida=" + bebida + ", ingredientes=" + ingredientes + '}';
    }
}

