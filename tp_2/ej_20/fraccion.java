//Cree una clase OperacionesFraccion que contenga un método main donde se solicite al usuario el ingreso de 4 valores numéricos enteros con los cuales se crearan 2 objetos Fracción y finalizada la creación de los mismos se ejecutaran los 4 métodos implementados anteriormente asignando el resultado a una nueva variable de tipo Fracción
//y mostrando por pantalla el resultado de las operaciones realizadas.
//
package ej_20;
public class fraccion {

    private Integer numerador;
    private Integer denominador;

    public fraccion(Integer numerador, Integer denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void setNumerador(Integer numerador){
        this.numerador = numerador;
    }

    public Integer getNumerador() {
        return numerador;
    }

    public void setDenominador(Integer denominador){
        this.denominador = denominador;
    }

    public Integer getDenominador(){
        return denominador;
    }

    public fraccion sumarFracciones(fraccion f1, fraccion f2) {
        int nuevoNumerador = f1.numerador * f2.denominador + f2.numerador * f1.denominador;
        int nuevoDenominador = f1.denominador * f2.denominador;
        return new fraccion(nuevoNumerador, nuevoDenominador);
    }
    public fraccion restarFracciones(fraccion f1, fraccion f2) {
        int nuevoNumerador = f1.numerador * f2.denominador - f2.numerador * f1.denominador;
        int nuevoDenominador = f1.denominador * f2.denominador;
        return new fraccion(nuevoNumerador, nuevoDenominador);
    }
    public fraccion multiplicarFracciones(fraccion f1, fraccion f2) {
        int nuevoNumerador = f1.numerador * f2.numerador;
        int nuevoDenominador = f1.denominador * f2.denominador;
        return new fraccion(nuevoNumerador, nuevoDenominador);
    }
    public fraccion dividirFracciones(fraccion f1, fraccion f2) {
        if (f2.numerador == 0) {
            System.out.println("No se puede dividir por cero.");
            return null;
        }
        int nuevoNumerador = f1.numerador * f2.denominador;
        int nuevoDenominador = f1.denominador * f2.numerador;
        return new fraccion(nuevoNumerador, nuevoDenominador);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }

}
