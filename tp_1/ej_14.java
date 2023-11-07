//      Generar un número aleatorio entre 0 y 100, para ello use la siguiente función:  int x = new Double(Math.random() * 100).intValue();
//      Luego codifique la lógica necesaria para encontrar el número aleatorio.
//      Ayudando al usuario informando al mismo si el número ingresado es mayor o menor al número aleatorio buscado.
//      Una vez encontrado el número muestre la cantidad de intentos necesarios para lograrlo.
//
import java.util.Scanner;
public class ej_14 {
    public static void main(String[] args) {

        int random = new Double(Math.random() * 100).intValue(); // genera un valor aleatorio entre 1 y 100
        int i = 0;

        System.out.println("Intenta adivinar un numero entre 0 y 100");

        Scanner scanner = new Scanner(System.in);
        int n;

        // us0 un do while para que realice las acciones mientras el número sea distinto de random
        do {
            // pido el número y con i++ vamos acomulando los intentos realizados
            System.out.print("Numero Ingresado: ");
            n = scanner.nextInt();
            i++;

            // comparo n con random para saber si es mayor o menor y ayudar a encontrar el número
            if (n < random) {
                System.out.println("Es muy bajo");
            } else if (n > random) {
                System.out.println("Es muy alto");
            } else {
                System.out.println("Correcto, numero encontrado, cantidad de intentos: " + i);
            }
        } while (n != random);
    }
}