//Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 - 999)
//y por medio del uso de las operaciones matemáticas módulo 10
//y división por 10 efectué la suma de los 3 dígitos del número.
//Ejemplo ingreso 563, salida del algoritmo 14.
//
import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número de tres dígitos");
        int num = sc.nextInt();

        int primerDigito = num / 100;
        int segundoDigito = (num / 10) % 10;
        int tercerDigito = num % 10;

        int suma = primerDigito + segundoDigito + tercerDigito;
        System.out.println("La suma de los tres digitos es: "+ suma);
    }
}
