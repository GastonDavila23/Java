//Crea un array o arreglo unidimensional con un tamaño de 5,
//asignale los valores numéricos manualmente (los que tú quieras) y muestralos por pantalla.
//Solicite los números mediante un bucle.
//
import java.util.Scanner;

public class ej_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int i = 0;

        for (i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número");
            numeros[i] = sc.nextInt();
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
