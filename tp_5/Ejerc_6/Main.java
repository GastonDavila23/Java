//  Codifique un programa que solicite al usuario un valor para la celda y que solicite la posición donde se desea almacenar el valor,
//      cree una instancia de la clase Celda, asigne los valores cargados por el usuario y agregue la instancia a la lista matrizCuadrada;
//      repita este proceso hasta que el usuario ingrese como valor la cadena “FIN”.
//  Muestre por pantalla los valores cargados en matrizCuadrada.
//  Codifique un método que reciba como parámetro los valores fila y columna y retorne el valor almacenado,
//      en caso de que la fila y la columna no exista retorne el mensaje “La fila y columna indicada no ha sido asignada”
//
import java.util.Scanner;

public class Main {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Matriz matriz = new Matriz();

        while (true) {
            System.out.print("Ingrese un valor (o 'FIN' para salir): ");
            String valor = sc.nextLine();

            if (valor.equals("FIN")) {
                break;
            }

            System.out.print("Ingrese la fila: ");
            int fila = Integer.parseInt(sc.nextLine());

            System.out.print("Ingrese la columna: ");
            int columna = Integer.parseInt(sc.nextLine());

            Celda celda = new Celda(fila, columna, valor);
            matriz.agregarCelda(celda);
        }

        System.out.println("Valores en la matriz:");
        for (Celda celda : matriz.matrizCuadrada) {
            System.out.println(celda);
        }

        System.out.println("Ingrese la fila y la columna para obtener el valor:");
        System.out.print("Fila: ");
        int fila = Integer.parseInt(sc.nextLine());
        System.out.print("Columna: ");
        int columna = Integer.parseInt(sc.nextLine());

        String valorObtenido = matriz.obtenerValor(fila, columna);
        System.out.println("Valor obtenido: " + valorObtenido);

        sc.close();
    }

}
