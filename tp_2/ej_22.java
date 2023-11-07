//Suma los dígitos de un número ingresado por el usuario de forma recursiva.
//Ejemplo: el usuario ingresa 1596
//El programa debe sumar 1 + 5 + 9 + 6
//
import java.util.Scanner;

public class ej_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        int suma = sumar(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

    }
    public static int sumar(int num) {
        if (num < 10) {
            return num;
        } else {
            int ultimo = num % 10;
            int numeroSinUltimo = num / 10;
            return ultimo + sumar(numeroSinUltimo);
        }
    }
}
