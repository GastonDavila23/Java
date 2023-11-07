//En Argentina cada persona está identificada con un Documento Nacional de Identidad (DNI) en el que figura un número y una letra,
//por ejemplo 56999545W La letra que sigue al número se calcula siguiendo la metodología que vamos a indicar.
//Crea un programa que calcule la letra de un DNI a partir del número de DNI que introduzca el usuario.
//Es decir, se debe pedir el DNI sin la letra por teclado y el programa nos devolverá el DNI completo (con la letra).
//Para calcular la letra, se debe tomar el resto de dividir nuestro número de DNI entre 23.
//El resultado debe estar por tanto entre 0 y 22.
//Crea un método obtenerLetra(int numeroDNI) donde según el resultado de la anterior fórmula busque en un array de caracteres la posición que corresponda a la letra.
//Esta es la tabla de caracteres:
//      Posición       0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22
//      Letra          T  R  W  A  G  M  Y  F  P  D   X   B   N   J   Z   S   Q   V   H   L  C    K   E
//Por ejemplo, si introducimos el  DNI 20267079, el resto de dividirlo por 23 sería 8,
//luego la letra sería la P, que es la que ocupa esa posicion  en la matriz de caracteres.
//
import java.util.Scanner;

public class ej_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un DNI");
        int dni = sc.nextInt();

        String letra = obtenerLetra(dni);
        System.out.println("El DNI es:" + dni + letra);
    }
    public static String obtenerLetra(int dni){
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int result = dni%23;
        String letra = letras[result];
        return letra;
    }
}