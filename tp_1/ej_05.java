//      Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
//
import java.util.Scanner;
public class ej_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es divisible por 2");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("a es divisible por 2");
        } else {
            System.out.println("a NO es divisible por 2");
        }
    }
}