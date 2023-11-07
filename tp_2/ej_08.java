//Reemplaza todas las a del String anterior por una e. (aplique replace)
//
import java.util.Scanner;

public class ej_8 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        System.out.println(frase.replace('a', 'e'));
    }
}
