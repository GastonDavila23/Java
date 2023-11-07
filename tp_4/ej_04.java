//Codifique un algoritmo que permita cargar un array de una dimensión de 20 elementos enteros.
//Finalizada la carga de los 20 elementos el programa debe solicitar como se desea ordenar el array ASCENDENTE O DESCENDENTE
//y que método de ordenamiento aplicar (inserción, burbuja, selección),
//según las opciones elegidas aplique el algoritmos fundamental de ordenamiento que corresponda.
//Muestre por pantalla el array original desordenado y su resultante ordenado según las opciones elegidas.
//
import java.util.Arrays;
import java.util.Scanner;

public class ej_04 {
    public static void main(String[] args) {
        int[] array = new int[20];

        // Cargar el array con valores aleatorios
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array original: " + Arrays.toString(array));

        Scanner sc = new Scanner(System.in);

        System.out.println("Elija el metodo de ordenamiento: 1 para insercion, 2 para burbuja, 3 para seleccion");
        int metodo = sc.nextInt();
        System.out.println("Elija el orden: 1 para ascendente, 2 para descendente");
        int orden = sc.nextInt();

        if (metodo == 1) {
            insertionSort(array, orden == 1);
        } else if (metodo == 2) {
            bubbleSort(array, orden == 1);
        } else if (metodo == 3) {
            selectionSort(array, orden == 1);
        }

        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] array, boolean ascendente) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && ((ascendente && array[j] > key) || (!ascendente && array[j] < key))) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] array, boolean ascendente) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if ((ascendente && array[j] > array[j + 1]) || (!ascendente && array[j] < array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array, boolean ascendente) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if ((ascendente && array[j] < array[index]) || (!ascendente && array[j] > array[index])) {
                    index = j;
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
