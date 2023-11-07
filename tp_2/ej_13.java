//Pedir el ingreso de dos cadenas por por teclado,
//indicar si la segunda cadena se encuentra dentro de la primera (usar indexOf o contains).
//
import java.util.Scanner;

public class ej_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String fraseUno = sc.nextLine();
        System.out.println("Ingrese otra frase");
        String fraseDos = sc.nextLine();

        if(fraseUno.indexOf(fraseDos) >= 0 ){
            System.out.println("verdad");
        }else{
            System.out.println("mentira");
        }

        if(fraseUno.contains(fraseDos)){
            System.out.println("verdad");
        }else{
            System.out.println("mentira");
        }
    }
}
