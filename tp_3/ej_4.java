//Escriba una aplicación que:
// a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un arreglo unidimensional.
// b) determine y muestre el mayor de los números en el arreglo
// c) determine y muestre el menor de los números del arreglo calcule
//y muestre el rango (diferencia entre el mayor y el menor) de los elementos en el arreglo
//
import java.util.Scanner;

public class ej_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[20];
        for (int i=0;i < numeros.length;i++) {
            System.out.println("Ingrese un número");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (mayor < numero){
                mayor = numero;
            }
            if (menor > numero){
                menor = numero;
            }
        }

        int diferencia = mayor-menor;

        System.out.println("mayor:" + mayor);
        System.out.println("menor:" + menor);
        System.out.println("diferencia:" + diferencia);
    }
}