//      Modifica la aplicación anterior para que nos pida el nombre que queremos introducir
//      (aplica Scanner y JOptionPane).
//
import java.util.Scanner;
public class ej_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.println("Bienvenido " + nombre);
    }
}
