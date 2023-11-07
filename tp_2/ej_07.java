//Solicite el ingreso de una cadena y determine el tamaño de la misma
//y cuantas vocales tiene en total (recorre el String con charAt)
//
import java.util.Scanner;

public class ej_7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        System.out.println("La frase tiene " + frase.length() + " caracteres");

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " vocales");
    }
}
