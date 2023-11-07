//Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida
//y mostraremos el resultado por pantalla.
//
import java.util.Scanner;

public class ej_10 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();

        System.out.println("Quiere la frase en Mayúsculas (M) o minúsculas (m)");
        String opcion = sc.nextLine();

        if (opcion.equals("M")) {
            String fraseMayus = frase.toUpperCase();
            System.out.println(fraseMayus);
        }

        if (opcion.equals("m")) {
            String fraseMinus = frase.toLowerCase();
            System.out.println(fraseMinus);
        }
    }
}
