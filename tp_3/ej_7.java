//Escriba una aplicación que solicite y cargue en un arreglo 10 dígitos enteros,
//luego cree dos nuevos arreglos y asigne al primero los números ingresados por el usuario de forma ascendente
//y en el segundo de forma descendente.
//Muestre los 2 arreglos por pantalla.
//
import java.util.Arrays;
import java.util.Scanner;

public class ej_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("ascendente");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("descendente");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[9 - i]);
        }
    }
}