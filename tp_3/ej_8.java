//Solicite al usuario el ingreso de una cadena de números separadas por guiones medio,
//por ejemplo: 45-9-8-6-45-23-21-74-96-32-45-25
//Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en un arreglo,
//y calcular la suma total de los elementos y el valor promedio calculado.
//
import java.util.Scanner;

public class ej_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String numeros = "45-9-8-6-45-23-21-74-96-32-45-25";

        int suma = 0;
        String arry[] = numeros.split("-");
        for (int i = 0; i < arry.length; i++) {
            int num = Integer.valueOf(arry[i]);
            suma = suma + num;

        }
        int promedio = suma / arry.length;
        System.out.println(promedio+ " " + suma);
    }
}