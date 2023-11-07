//Crea un programa donde se pida el ingreso de una cadena y por medio de recursión mostrar la cadena de forma inversa.
//Ejemplo: Ingreso “computadora de escritorio”
//Invertir cadena “oirotircse ed arodatupmoc”
//
import java.util.Scanner;

public class ej_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        String fraseInvertida = invertir(frase);
        System.out.println("frase invertida: " + fraseInvertida);
    }
    public static String invertir(String frase) {
        if (frase.length() <= 1) {
            return frase;
        } else {
            char primerCaracter = frase.charAt(0);
            String resto = frase.substring(1);
            return invertir(resto) + primerCaracter;
        }
    }
}
