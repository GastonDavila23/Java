//Escriba una aplicación para almacenar en un ArrayList<Integer> aleatoriamente 20 números enteros positivos pares del 1 al 100, de los cuales se desea saber:
// a) su promedio aritmético
// b) cuántos de los números son iguales al promedio aritmético
// c) cuántos de los números son mayores que el promedio aritmético
// d) cuántos de los números son menores que el promedio aritmético
//
import java.util.ArrayList;
import java.util.Scanner;

public class Ejerc_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arry1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 100 + 1);
            arry1.add(num);
        }
        System.out.println("Este es el array");
        for (int i = 0; i < 20; i++) {
            System.out.println(arry1.get(i));
        }
        int promedio = 0;
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            suma = suma + arry1.get(i);
        }
        promedio = suma / arry1.size();
        System.out.println("Este es el promedio");
        System.out.println(promedio);
        int numPromedio = 0;
        for (int i = 0; i < 20; i++) {
            if (arry1.get(i) == promedio){
                numPromedio++;
            }
        }
        System.out.println("La cantidad de numeros que son iguales al promedio es "+numPromedio);
        int mayPromedio = 0;
        int menPromedio = 0;
        for (int i = 0; i < 20; i++) {
            if (arry1.get(i)>promedio){
                mayPromedio++;
            }
            else{
                menPromedio++;
            }
        }
        System.out.println("La cantidad de numeros mayor al promedio son "+mayPromedio);
        System.out.println("La cantidad de numeros menor al promedio son "+menPromedio);
    }
}
