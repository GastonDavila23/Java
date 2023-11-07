//Cree una clase Calculo que contenga un método main, donde cree una instancia de la clase OperacionMatematica,
//asigne 2 valores para las variables de la instancia y ejecute la función aplicarOperacion,
//pasando como parámetro primero “+”, después “-”, a continuación “*” y finalmente “/”.
//Muestre por pantalla el resultado de las operaciones.
//
package ej_19;

public class operacionMatematica {

    private double valor1;
    private double valor2;
    private String operacion;

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor2() {
        return valor2;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getOperacion() {
        return operacion;
    }

    public operacionMatematica(double valor1, double valor2, String operacion) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacion = operacion;
    }

    private double sumarNumeros() {
        return valor1 + valor2;
    }

    private double restarNumeros() {
        return valor1 - valor2;
    }

    private double multiplicarNumeros() {
        return valor1 * valor2;
    }

    private double dividirNumeros() {
        return valor1 / valor2;
    }

    public double aplicarOperacion(String operacion) {
        if (operacion .equals("+")) {
            return sumarNumeros();
        }
        if (operacion .equals("-")) {
            return restarNumeros();
        }
        if (operacion .equals("*")) {
            return multiplicarNumeros();
        }
        if (operacion .equals("/")) {
            return dividirNumeros();
        } else {
            System.out.println("No se pudo realizar la operacion");
        }
        return Double.NaN;
    }
}
