//Cree una clase Fracción con dos atributos numéricos enteros, numerador y denominador.
//Agregue un constructor sobrecargado (debe contener como parámetros el numerador y el denominador) que cree el objeto Fracción correspondiente.
//Agregue a la clase los siguientes 4 métodos e implemente los mismos:
//public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
//……….
//}
//public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
//……….
//}
//public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
//……….
//}
//public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
//……….
//}
//
package ej_20;

import java.util.Scanner;
import ej_20.fraccion;

public class Main {
    public static void main (String[]args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numerador de la primera fracción: ");
        int numerador1 = sc.nextInt();
        System.out.print("Ingrese el denominador de la primera fracción: ");
        int denominador1 = sc.nextInt();

        System.out.print("Ingrese el numerador de la segunda fracción: ");
        int numerador2 = sc.nextInt();
        System.out.print("Ingrese el denominador de la segunda fracción: ");
        int denominador2 = sc.nextInt();

        fraccion fraccion1 = new fraccion(numerador1, denominador1);
        fraccion fraccion2 = new fraccion(numerador2, denominador2);

        fraccion suma = fraccion1.sumarFracciones(fraccion1, fraccion2);
        fraccion resta = fraccion1.restarFracciones(fraccion1, fraccion2);
        fraccion multiplicacion = fraccion1.multiplicarFracciones(fraccion1, fraccion2);
        fraccion division = fraccion1.dividirFracciones(fraccion1, fraccion2);

        System.out.println("la suma de las fracciones es de:" + suma);
        System.out.println("la resta de las fracciones es de:" + resta);
        System.out.println("la multiplicacion de las fracciones es de:" + multiplicacion);
        System.out.println("la division de las fracciones es de:" + division);

    }
}
