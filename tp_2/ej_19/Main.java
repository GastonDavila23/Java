//Cree una clase OperacionMatematica con dos atributos numéricos decimales, valor1 y valor2 y un atributo String de nombre operación.
//Cree los correspondientes métodos get/set.
//Agregue a la clase los siguientes 5 métodos:
//private double sumarNumeros(){
//return valor1 + valor2;
//}
//private double restarNumeros(){
//return valor1 - valor2;
//}
//private double multiplicarNumeros(){
//return valor1 * valor2;
//}
//private double dividirNumeros(){
//return valor1 / valor2;
//}
//El quinto método será el siguiente:
//public double aplicarOperacion(String operacion){
//…………………..
//}
//
package ej_19;

import ej_19.operacionMatematica;

public class Main {
    public static void main(String[]args){
        operacionMatematica operacion = new operacionMatematica(10.0, 2.0, "");

        String[] operaciones = {"+", "-", "*", "/"};

        for (String calculo : operaciones) {
            operacion.setOperacion(calculo);
            double resultado = operacion.aplicarOperacion(calculo);
            System.out.println("Resultado de " + operacion.getValor1() + " " + calculo + " " + operacion.getValor2() + " = " + resultado);
        }

    }
}
