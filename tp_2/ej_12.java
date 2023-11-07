//Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
//
import java.util.Scanner;

public class ej_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();

        String letraCuatro = frase.substring(3,4);

        String letraCinco = frase.substring(4,5);

        System.out.println("La cuarta letra es '" + letraCuatro + "'");
        System.out.println("La quinta letra es '" + letraCinco + "'");
    }
}
