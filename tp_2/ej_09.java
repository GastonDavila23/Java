//Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
//Muéstralos en línea recta, separados por un espacio entre cada carácter.
//
import java.util.Scanner;

public class ej_9 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            int codigoAscii = (int) caracter;
            System.out.print(codigoAscii + " ");
        }
    }
}
