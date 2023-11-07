//Codifique un programa que solicite un número entero mayor a cero
//y que mediante recursión sume todos los números números naturales desde el número ingresado hasta 1.
//Ejemplo: Ingreso 10
//El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
//
import java.util.Scanner;

public class ej_21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero mayor a cero: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("El número ingresado debe ser mayor a cero.");
        } else {
            int resultado = sumarNumeros(numero);
            System.out.println("La suma de los números desde " + numero + " hasta 1 es: " + resultado);
        }

    }
    public static int sumarNumeros(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sumarNumeros(num - 1);
        }
    }
}
