//Solicite el ingreso de un numero decimal y asigne el mismo a una variable valorDecimal de tipo double,
//aplique las operaciones de CASTING para convertir la variable a los siguientes tipos de datos, short, int, long, String, float
//investigue las diferentes formas de lograr la conversión.
//Muestre por pantalla el resultado de las conversiones.
//
import java.util.Scanner;

public class ej_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un número decimal");
        double numDecimal = sc.nextDouble();

        String doubleAString = String.valueOf(numDecimal);
        int doubleAInt = (int) numDecimal;
        short doubleAShort = (short) numDecimal;
        long doubleASLong = (long) numDecimal;
        float doubleAFloat = (float) numDecimal;

        System.out.println("double a String: "+ doubleAString);
        System.out.println("double a int: "+ doubleAInt);
        System.out.println("double a short: "+ doubleAShort);
        System.out.println("double a long: "+ doubleASLong);
        System.out.println("double a float: "+ doubleAFloat);
    }
}
