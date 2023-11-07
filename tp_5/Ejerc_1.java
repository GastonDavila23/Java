//Crea un ArrayList<Integer>, asignar los valores numéricos manualmente (los que tú quieras) hasta ingresar un valor menor a 0,
//mostrar los números por pantalla.
//Solicite los números mediante un bucle.
//
import java.util.ArrayList;
import java.util.Scanner;

public class Ejerc_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int num;

        do {
            System.out.println("Ingresa un numero, ingrese un numero menor a 0 para finalizar");
            num = sc.nextInt();

            if (num >= 0) {
                numeros.add(num);
            }
        } while (num >= 0);

        System.out.println("Los números ingresados fueron: " + numeros);
    }
}