//Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o igual a 10.
//Cree un arreglo de tamaño [X,X] de tipo int. Posteriormente solicite los valores necesarios para cargar cada una de las celdas de la matriz.
//Muestre por pantalla la matriz resultante.
//Al finalizar la carga sume cada una de las columnas del array y asigne los resultados en una nueva matriz de una dimensión,
//finalmente sume los valores de esta última matriz y muestre el resultado por pantalla.
// Ejemplo: X=5
//       3  5  8 88  7
//      45 34 67 87 54
//      34 43 23 44 55
//       6  0 45  4 66
//      56 44 32 12 54
//
//      144 126 175 235 236
//
//      Total: 916
//
package parte_2;

import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número para el tamaño del array");
        int num = sc.nextInt();

        if (num >= 3 && num <= 10) {
            System.out.println("Número correcto");
            int lista[][] = new int[num][num];

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.println("Ingrese un número");
                    lista[i][j] = sc.nextInt();
                }
            }

            System.out.println("El array es el siguiente:");
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.print(lista[i][j] + " ");
                }
                System.out.println();
            }
            int suma = 0;
            int sumaColumnas[] = new int[num];
            for (int j = 0; j < num; j++) {
                for (int i = 0; i < num; i++) {
                    suma = suma + lista[i][j];
                }
                sumaColumnas[j] = suma;
                suma=0;
            }

            System.out.println("La suma de cada columna");
            for (int i = 0; i < sumaColumnas.length ; i++) {
                System.out.println(sumaColumnas[i]);
                suma = suma + sumaColumnas[i];
            }

            System.out.println("la suma total es de :" + suma);
        } else {
            System.out.println("Número incorrecto no se ejecutará el programa");
        }
    }
}