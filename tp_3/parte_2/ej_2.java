//Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un primer array de tamaño [X,Y] de tipo entero
//y almacene en cada posición un valor entero que deberá ser ingresado por el usuario.
//A continuación cree un segundo array de tamaño [Y,X]
//y almacene en cada posición un valor entero que deberá ser ingresado por el usuario.
//Finalmente cree un tercer array de tamaño [X,Y] que será el resultante de multiplicar cada una de las posiciones de las filas del array uno por cada una de las posiciones de las columnas del array 2.
//Muestre por pantalla cada uno de los arrays con sus valores.
//
package parte_2;
import java.util.Scanner;
public class ej_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero x");
        int X = sc.nextInt();
        System.out.println("Ingrese el numero Y");

        int Y = sc.nextInt();
        int arry1[][] = new int[X][Y];
        int arry2[][] = new int[Y][X];
        int arry3[][] = new int[X][Y];

        System.out.println("Ingrese los datos del array1");
        for (int i = 0; i < arry1.length; i++) {
            for (int j = 0; j < arry1[i].length; j++) {
                arry1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ingrese los datos del array2");
        for (int i = 0; i < arry2.length; i++) {
            for (int j = 0; j < arry2[i].length; j++) {
                arry2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arry3.length; i++) {
            for (int j = 0; j < arry3[i].length; j++) {
                arry3[i][j] = arry1[i][j] * arry2[j][i];
            }
        }

        System.out.println("Primer array");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.print(arry1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Segundo array");
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print(arry2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Tercer array");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.print(arry3[i][j] + " ");
            }
            System.out.println();
        }
    }
}