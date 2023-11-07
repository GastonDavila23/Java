//      Escribe una aplicación con un String que contenga una contraseña cualquiera.
//      Después se te pedirá que introduzcas la contraseña, con 3 intentos.
//      Cuando aciertes ya no pedirá más la  contraseña y mostrara un mensaje diciendo “Acceso Correcto”.
//      Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
//
import java.util.Scanner;
public class ej_11 {
    public static void main(String[] args) {

        /*
        String contraseñaCorrecta = "asd123";
        Scanner sc = new Scanner(System.in);
        int intentos = 3;

        // creo un do while para que realice las acciones hasta que retorne true
        do {
            System.out.println("Ingrese la contraseña");
            String contraseñaIngresada = sc.nextLine();

            // si las contraseñas coinciden hay acceso correcto
            if (contraseñaIngresada == contraseñaCorrecta) {
                System.out.println("Acceso correcto");
                break;
                // si no coincide la vuelve a pedir hasta agotar los 3 intentos
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Contraseña incorrecta. Ingresela nuevamente. Te quedan " + intentos + " intento/s");
                } else {
                    System.out.println("Contraseña incorrecta. No te quedan más intentos.");
                    break;
                }
            }
        } while (true); */

        String contraseñaCorrecta = "asd123";
        int intentos = 3;

        Scanner sc = new Scanner(System.in);

        while (intentos > 0) {
            System.out.println("Ingrese su contraseña:");
            String contraseñaIngresada = sc.nextLine();

            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                System.out.println("Acceso correcto");
                break;
            } else {
                intentos--;

                if (intentos == 0) {
                    System.out.println("Contraseña incorrecta. No le quedan más intentos");
                } else {
                    System.out.println("Contraseña incorrecta. Le quedan " + intentos + " intentos");
                }
            }
        }
    }
}