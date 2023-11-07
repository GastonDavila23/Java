//Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10,
//pedir los valores numéricos enteros para cargar cada uno de los arreglos,
//cree un tercer arreglo de tamaño 10 que contenga en casa posición  la suma de la multiplicación de cada elemento del array 1 por cada elemento del array 2
//ARRAY3 = (posición 0 del arreglo 1 * posición 0 del arreglo 2) + (posición 0 del arreglo 1 * posición 1 del arreglo2) + (posición 0 del arreglo 1 * posición 2 del arreglo 2) + ………….+ (posición 4 del arreglo 1 * posición 9 del arreglo 2)
//Use 2 estructuras iterativas anidadas para realizar el cálculo y asignación de los valores en el 3 array.
//
import java.util.Scanner;

public class ej_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int arry1[] = new int[5];
        int arry2[] = new int[10];
        int arry3[] = new int[10];
        
        for (int i = 0; i < arry1.length; i++) {
            System.out.println("ingrese un numero");
           arry1[i] = sc.nextInt();
        }
        for (int i = 0; i < arry2.length; i++) {
            System.out.println("ingrese un numero");
            arry2[i] = sc.nextInt();
        }
        for (int i = 0; i < arry1.length; i++) {
            for (int j = 0; j < arry2.length; j++) {
                suma = suma+arry1[i]*arry2[j];
            }
            arry3[i]=suma;
        }
        for (int i = 0; i < arry3.length; i++) {
            System.out.println(arry3[i]);
        }
    }
}