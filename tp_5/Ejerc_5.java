//Escriba una aplicación que solicite y cargue en una ArrayList<Integer> 10 dígitos enteros,
//luego cree dos nuevas ArrayList<Integer>
//y asigne a la primera los números ingresados por el usuario de forma ascendente
//y en la segunda de forma descendente.
//Muestre las 2 listas por pantalla. Investigue como ordenar una Lista(List<>)
//
import java.util.ArrayList;
import java.util.Collections;

public class Ejerc_5 {
    public static void main (String[]args){

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < 9; i++) {
            numeros.add((int) (Math.random() * 50) + 0);
        }

        System.out.println("desordenada");
        System.out.println(numeros);

        System.out.println("ascendente");
        Collections.sort(numeros);
        System.out.println(numeros);

        System.out.println("descendente");
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println(numeros);


    }
}
