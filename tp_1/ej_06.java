//      Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
//      El IVA sera una constante que sera del 21%.
//
import java.util.Scanner;
public class ej_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");

        double precio = sc.nextDouble();
        double precioFinal = precio + (precio * 0.21);

        System.out.println("El precio final con IVA es $" + precioFinal);
    }
}
