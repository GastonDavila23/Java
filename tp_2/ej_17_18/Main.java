//Cree una clase FuncionesPrograma y codifique una función estática que reciba como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
//
//public static String getFechaString(Date fecha){
//        ……….
//        }
//Cree una clase Principal que contenga un método main y haga uso de la función getFechaString.
//
package ej_17_18;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        Date fechaActual = new Date();
        String fechaString = funciones.getFechaString(fechaActual);
        System.out.println("Fecha como cadena: " + fechaString);

        System.out.println("Ingrese un dia, un mes, y un año");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();

        Date fecha = funciones.getFechaDate(dia, mes, anio);
        System.out.println("la fecha es: " + fecha);
    }
}

