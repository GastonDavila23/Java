//      Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
//      Si son iguales indicarlo también.
//      Ve cambiando los valores para comprobar que funciona.
//
public class ej_04 {
    public static void main(String[] args) {
        int a = 7;
        int b= 5;

        if (a == b) {
            System.out.println("a y b son iguales");
        } else if (a > b) {
            System.out.println("a es mayor");
        } else {
            System.out.println("b es mayor");
        }
    }
}
