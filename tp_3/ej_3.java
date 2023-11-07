//Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado
//y crear una función que rellene el array o arreglo con los múltiplos de un numero pedido por teclado.
//Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el array contendrá 3, 6, 9, 12, 15.
//Muéstralos por pantalla usando otra función distinta.
//
import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño que desea para el array");
        int tamanio = sc.nextInt();

        int array[] = new int[tamanio];

        System.out.println("ingrese un número");
        int numero = sc.nextInt();

        for (int i=0; i <= tamanio-1;i++){
            array[i] = numero * (i + 1);
        }

        for (int multiplo : array) {
            System.out.println(multiplo);
        }
    }
}