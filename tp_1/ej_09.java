//      Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
//
public class ej_09 {
    public static void main(String[] args) {
        int i = 100;

        // creo un while que recorra los numeros del 1 al 100 y vamos imprimiendo los que son divisibles por 2 y 3
        while (i > 0) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}