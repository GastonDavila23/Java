//Codifique mediante código JAVA los pseudocódigos de los algoritmos fundamentales presentados en el apunte “Algoritmos Fundamentales” correspondiente.
//  Ordenamiento por inserción
//  Algoritmo de la burbuja
//  Ordenamiento por selección
//  Búsqueda secuencial
//
import java.util.Arrays;
import java.util.Scanner;

public class ej_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ordenamiento por inserción ");
        int[] arry1 = {5, 3, 4, 6, 7, 8, 1, 9, 2, 10, 14, 13, 12, 11, 15};
        Arrays.sort(arry1);
        for (int value : arry1) {
            System.out.print(" " + value);
        }
        System.out.println(" ");
        System.out.print("Algoritmo de la burbuja ");
        int[] arry2 = {9, 7, 5, 4, 2, 1, 8, 6, 3, 15, 13, 14, 11, 12, 10};
        for (int i = 0; i < arry2.length - 1; i++) {
            for (int j = 0; j < arry2.length - 1; j++) {
                if (arry2[j] > arry2[j + 1]) {
                    int aux = arry2[j];
                    arry2[j] = arry2[j + 1];
                    arry2[j + 1] = aux;
                }


            }

        }
        System.out.println(" ");
        for (int k : arry2) {
            System.out.print(" " + k);
        }
        System.out.println(" ");
        System.out.print("Ordenamiento por selección ");
        int[] arry3 = {9, 7, 5, 4, 2, 1, 8, 6, 3, 15, 13, 14, 11, 12, 10};
        for (int i = 1; i < arry3.length; i++) {
            int aux = arry3[i];
            int j = i - 1;
            while ((j >= 0) && (aux < arry3[j])) {
                arry3[j + 1] = arry3[j];
                j--;
            }
            arry3[j + 1] = aux;
        }
        System.out.println(" ");
        for (int j : arry3) {
            System.out.print(" " + j);
        }
        System.out.println(" ");
        System.out.println("Búsqueda secuencial");
        int[] arry4 = {9, 7, 5, 4, 2, 1, 8, 6, 3, 15, 13, 14, 11, 12, 10};
        System.out.println("Ingrese un numero para buscarlo en el array");
        int numingresado = sc.nextInt();
        boolean encontro=false;
        for (int j : arry4) {
            if (numingresado == j) {

                encontro = true;
                break;
            }
        }

        if (encontro){
            System.out.println("El numero fue encontrado");
        }else{
            System.out.println("El numero no se encuntra en la lista");
        }

    }
}
