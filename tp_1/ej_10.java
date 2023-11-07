//      Lee un número por teclado y comprueba que este número es mayor o igual que cero,
//      si no lo es lo volverá a pedir (do while),
//      después muestra ese número por consola.
//
import java.util.Scanner;
public class ej_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número mayor a 0");
        int a = sc.nextInt();

        // creo un do while que realice las acciones hasta que el número ingresado sea mayor a 0
        do {
            if (a < 0) {
                System.out.println("Ingresó un número menor a 0, vuelva a intentarlo");
                a = sc.nextInt();
            }
        } while (a < 0);
        System.out.println("Su número es " + a);
    }
}