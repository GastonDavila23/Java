//Codifique un algoritmo que solicite un 2 valores enteros mayores o iguales a 2, que se corresponden a cantidad de filas y columnas.
//Cree un arreglo de tamaño[X,Y]de tipo entero, el tamaño se corresponde a los 2 valores enteros ingresados inicialmente.
//Solicite al usuario que ingrese números enteros para cargar cada una de las celdas de la matriz.
//Finalizada la carga calcule el promedio entero de los elementos asignados y cargados en la matriz.
//Para terminar determine si el promedio calculado se encuentra asignado en alguna de las celdas,
//si es así indique la posición o posiciones correspondientes, caso contrario muestre el mensaje “No se encontró ninguna coincidencia”.
// Ejemplo: Ingreso 3 y 4 como valores enteros
// Creo la matriz 3 filas por 4 columnas y cargo los valores:
//       3 15 6 9
//       6 13 4 4
//      14  8 5 7
//El promedio entero es: 7
// El valor 7 se encuentra en la posición con índice (2,3)  o Fila 3, Columna 4
//
import java.util.Scanner;

public class ej_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas: ");
        int filas = scanner.nextInt();

        System.out.println("Ingrese la cantidad de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        int suma = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese un numero entero para la celda [" + (i+1) + ", " + (j+1) + "]: ");
                matriz[i][j] = scanner.nextInt();
                suma += matriz[i][j];
            }
        }

        int promedio = suma / (filas * columnas);
        boolean encontrado = false;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == promedio) {
                    System.out.println("El promedio " + promedio + " se encuentra en la posicion [" + (i+1) + ", " + (j+1) + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro ninguna coincidencia");
        }
    }
}
