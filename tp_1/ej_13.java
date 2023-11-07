//      Pide un número por teclado e indica si es un número primo o no.
//      Un número primo es aquel solo puede dividirse entre 1 y sí mismo.
//      Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//      Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese número hasta 1.
//      NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.
//
import java.util.Scanner;
public class ej_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un número para saber si es primo");

        int numeroIngreseado = sc.nextInt();
        int suma = 0;

        // en este for divido el número ingresado por todos sus numeros anteriores y si el resto de la division da 0 la variable suma va acumulando.
        // para que sea primo la variable suma no debe ser mayor a 1, ya que solo debe ser divisible por el mismo numero.
        for (int i = 1; i < numeroIngreseado; i++) {
            int aux = numeroIngreseado % i;
            if (aux == 0) {
                suma += 1;
            }
        }

        if (suma > 1)  {
            System.out.println(numeroIngreseado + " no es primo");
        } else {
            System.out.println(numeroIngreseado + " es primo");
        }
    }
}