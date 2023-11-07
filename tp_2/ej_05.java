//Solicite el ingreso de un número y conviértalo a un String mediante String.valueOf
//
import java.util.Scanner;

public class ej_5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = sc.nextInt();

        String numString = String.valueOf(num);
        System.out.println(numString);
    }
}
