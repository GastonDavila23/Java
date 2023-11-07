//      Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no (siendo sábado y domingo no laborales).
//      Usa un switch para ello. Valida que el número ingresado sea un valor entre 1 y 7, caso contrario solicite el valor nuevamente.
//
import java.util.Scanner;
public class ej_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;

        // uso un do while para realizar acciones mientras el día ingresado no sea del 1 al 7
        do {
            System.out.println("Ingrese un número del 1 al 7 para verificar el día de la semana");
            dia = sc.nextInt();
        } while (dia < 1 || dia > 7);

        String diaSemana;

        // mediante el switch uso el día ingresado en int y guardo en la variable diaSemana su equivalente en String
        switch (dia) {
            case 1:
                diaSemana = "lunes";
                break;
            case 2:
                diaSemana = "martes";
                break;
            case 3:
                diaSemana = "miércoles";
                break;
            case 4:
                diaSemana = "jueves";
                break;
            case 5:
                diaSemana = "viernes";
                break;
            case 6:
                diaSemana = "sábado";
                break;
            case 7:
                diaSemana = "domingo";
                break;
            default:
                diaSemana = "día no válido";
        }

        // realizo una comparación en la que del 1 al 5 es día laboral, mientras que el 6 y 7 son días no laborables
        if (dia >= 1 && dia <= 5) {
            System.out.println(diaSemana + " es  un día laboral");
        } else  {
            System.out.println(diaSemana + " no es un día laboral");
        }
    }
}