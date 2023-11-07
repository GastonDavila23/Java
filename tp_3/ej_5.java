//Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares del 1 al 100,
//de los cuales se desea saber:
// a) su promedio aritmético
// b) cuántos de los números son iguales al promedio aritmético
// c) cuántos de los números son mayores que el promedio aritmético
// d) cuántos de los números son menores que el promedio aritmético
//
import java.util.Random;

public class ej_5 {
    public static void main(String[] args) {
        Random random = new Random();

        int numeros[] = new int[20];

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) * 2 + 2;
            suma = suma + numeros[i];
        }

        int promedio = suma/numeros.length;
        int iguales = 0;
        int mayor = 0;
        int menor = 0;
        for (int numero : numeros) {
            if (numero == promedio){
                iguales++;
            }
            if (promedio < numero){
                mayor++;
            }
            if (promedio > numero ){
                menor++;
            }
        }

        System.out.println("promedio: " + promedio);
        System.out.println("iguales: " + iguales);
        System.out.println("mayor: " + mayor);
        System.out.println("menor: " + menor);
    }
}