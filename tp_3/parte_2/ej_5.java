//Codifique la siguiente matriz de 2 dimensiones, que se corresponde a una máquina expendedora de golosinas donde la columna 1 es la golosina,
//la columna 2 el precio y la columna 3 la cantidad (stock) actual de golosinas
//      KitKat 32 10 Chicles 2 50
//      Caramelos de Menta 2 50
//      Huevo Kinder 25 10
//      Chetoos 30 10
//      Twix 26 10
//      M&M'S 35 10
//      Papas Lays 40 20
//      Milkybar 30 10
//      Alfajor Tofi 20 15
//      Lata Coca 50 20
//      Chitos 45 10
// Tendremos un pequeño menú con las siguientes opciones:
// a. Pedir golosina: pedirá la posición de la golosina que quiera.
//      Esta máquina tiene golosinas en cada posición, identificados por su fila y columna, que será lo que introduzca el usuario al pedir una golosina,
//      por ejemplo si el usuario teclea 2 significa que está pidiendo la golosina que está en la fila 2.
//      Al seleccionar una golosina debe disminuir la cantidad disponible de la golosina.
//      En caso de agotar el stock de la golosina deberá informar de la situación al cliente y solicitarle que seleccione otra golosina.
// b. Mostrar golosinas: mostrara todas las golosinas con la cantidad actual disponible.
// c. Rellenar golosinas: esta es una función exclusiva de un técnico por lo que para su ejecución nos pedirá una contraseña,
//      si el usuario escribe “AdminXYZ” nos autorizara y pedirá la posición de la golosina y la cantidad a recargar.
//      La cantidad ingresada se sumara a la cantidad actual existente.
// d. Apagar maquina: sale del programa, antes de salir mostrara las ventas totales durante la ejecución del programa.
//      Es decir la suma de todos los precios de las golosinas seleccionadas desde el inicio del programa.
//
package parte_2;

import java.util.Scanner;

public class ej_5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String maquina[][] = {{"caramelo","100","10"},{"mogul", "50", "5"}, {"chicle","150","10"}, {"kiktat","200","2"}};
        int ventas = 0;

        while(true){
            System.out.println("Seleccione una opción");
            System.out.println("1.Pedir golosina");
            System.out.println("2.Mostrar golosinas");
            System.out.println("3.Rellenar maquina");
            System.out.println("4.Apagar maquina");
            int opcion = sc.nextInt();

            if (opcion == 1){
                System.out.println("Ingrese la posición de la golosina");
                int posicion = sc.nextInt();
                String golosina = maquina[posicion-1][0];
                System.out.println("Ingrese la cantidad que desea llevar");
                int cantidadLlevar = sc.nextInt();
                int cantidadMaquina = Integer.parseInt(maquina[posicion-1][2]);
                if((cantidadMaquina-cantidadLlevar) >= 0){
                    System.out.println("Aquí están tus:" + cantidadLlevar + "golosinas");
                    maquina[posicion-1][2] = String.valueOf(cantidadMaquina-cantidadLlevar);
                    ventas = ventas + (Integer.parseInt(maquina[posicion-1][1])*cantidadLlevar);
                }else{
                    System.out.println("Cantidad no disponible");
                }
            }

            if(opcion == 2){
                for (int i = 0; i < 4 ; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(maquina[i][j] +" ");
                    }
                    System.out.println();
                }
            }

            if (opcion == 3){
                System.out.println("Ingrese la contraseña");
                String contraseña = sc.next();
                if (contraseña.equals("AdminXYZ")){
                    System.out.println("Ingrese la posición de la golosina a llenar");
                    int posicion = sc.nextInt();
                    System.out.println("Cantidad a recargar");
                    int cantidadRecargar = sc.nextInt();
                    maquina[posicion-1][2] = String.valueOf(Integer.parseInt(maquina[posicion-1][2])+ cantidadRecargar);
                }else{
                    System.out.println("Contraseña incorrecta");
                }
            }

            if (opcion == 4){
                System.out.println("Apagando maquina");
                break;
            }
        }
        System.out.println("La cantidad de ventas es:" + ventas);
    }
}