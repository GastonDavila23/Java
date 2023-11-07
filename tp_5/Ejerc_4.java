//Realice una búsqueda secuencial en un ArrayList<Integer> que contenga 50 elementos generados aleatoriamente mediante la función java random.
//Realice una búsqueda secuencial de la siguiente forma:
//      - se lee el valor que se desea buscar,
//      - se compara la primera posición;
//      - si son iguales,
//      - fin de la búsqueda.
//      - De lo contrario, compararlo con la segunda posición, y así sucesivamente.
//      - Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje apropiado.
//      - Si se encuentra,se debe especificar la posición que ese valor ocupa en la lista por primera vez.
//
import java.util.ArrayList;
import java.util.Scanner;

public class Ejerc_4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 50 ; i++)   {
            numeros.add((int) (Math.random() * 50) + 0);
            System.out.println(numeros.get(i));
        }

        System.out.println("ingrese el numero que desea buscar");
        int numero_buscado = sc.nextInt();

        boolean contiene = numeros.contains(numero_buscado);
        System.out.println(contiene);
        int posicion = 0;
        if (contiene == true){
            posicion = numeros.indexOf(numero_buscado);
            System.out.println("se encuentra en la posicion "+ posicion+1);
        }else{
            System.out.println("no se encuentra ");
        }

    }
}