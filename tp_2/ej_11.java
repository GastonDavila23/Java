//Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo, compareToIgnoreCase)
//
import java.util.Scanner;

public class ej_11 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la primer palabra: ");
        String palabraUno = sc.nextLine();
        System.out.print("Ingresa la segunda palabra: ");
        String palabraDos = sc.nextLine();

        if (palabraUno.equals(palabraDos)) {
            System.out.println("Las palabras son iguales by equals");
        } else {
            System.out.println("Las palabras no son iguales by equals");
        }

        int iguales = palabraUno.compareTo(palabraDos);
        if (iguales == 0) {
            System.out.println("Las palabras son iguales by compareTo");
        } else if (iguales < 0) {
            System.out.println("La primer palabra es menor by compareTo");
        } else {
            System.out.println("La primer palabra es mayor by compareTo");
        }

        iguales = palabraUno.compareToIgnoreCase(palabraDos);
        if (iguales == 0) {
            System.out.println("Las palabras son iguales by compareToIgnoreCase");
        } else if (iguales < 0) {
            System.out.println("La primer palabra es menor by compareToIgnoreCase");
        } else {
            System.out.println("La primer palabra es mayor by compareToIgnoreCase");
        }
    }
}
