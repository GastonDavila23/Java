//      Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
//      Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
//
import java.util.Scanner;
public class ej_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "Gastón";
        System.out.println("Bienvenido " + nombre);
    }
}
