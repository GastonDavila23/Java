//Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado aleatoriamente mediante la función java random.
//Realice una  búsqueda secuencial de la siguiente forma:
// - se lee el valor que se desea buscar,
// - se compara la primera posición;
// - si son iguales,
// - fin de la búsqueda.
// - De lo contrario, compararlo con la segunda posición, y así sucesivamente.
// - Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje apropiado.
// - Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por primera vez.
//
import java.util.Random;
import java.util.Scanner;

public class ej_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeros[] = new int[50];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        System.out.println("Ingrese el numero que quiere buscar");
        int numero_buscado = sc.nextInt();

        int posicion =-1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero_buscado) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1){
            System.out.println("El número fue encontrado en la posición " + posicion);
        }else{
            System.out.println("El número no se encontró");
        }
    }
}