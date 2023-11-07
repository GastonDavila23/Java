//Empleando la clase HashMap()(con un String de clave y un entero largo de valor) implemente una agenda de teléfonos.
//  HashMap<String, Long> agenda = new  HashMap<String, Long>();
//El algoritmo debe contener un menú inicial con 3 opciones
//  1- Cargar Datos en la Agenda
//  2- Buscar Teléfono por Nombre
//  3- Listar Agenda El usuario deberá elegir que desea hacer:
//      Cargar Datos en la Agenda.
//          Debe solicitar el nombre completo de la persona y su respectivo teléfono, el nombre será usado como clave y el teléfono como valor del HashMap.
//
//          Se deben poder solicitar todas las personas que se deseen hasta que se indique que no se quiere seguir cargando,
//          cada vez que se ingrese una nueva persona se deberá validar si la clave ya existe (puede usar la función containsKey),
//          si existe deberá informar de la situación al usuario, si no existe se agregara al HashMap. Al terminar la carga se debe mostrar el menú nuevamente.
//      Buscar Teléfono por Nombre
//          Se debe solicitar el nombre de la persona a buscar, si no se encuentra mostrar el mensaje “La persona buscada no se encuentra en la agenda”,
//          caso contrario mostrar por pantalla el teléfono de la persona que se encontró en el HashMap.
//          Al finalizar mostrar nuevamente el menú.
//      Listar Agenda
//          Recorrer la totalidad de elementos que posee el HashMap agenda,
//          mostrando cada uno de los nombres y teléfonos que se encuentran almacenados.
//          Al finalizar volver al menú.
//
import java.util.HashMap;
import java.util.Scanner;

public class ej_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Long> agenda = new HashMap<String, Long>();
        while (true) {
            System.out.println("Eliga una opcion");
            System.out.println("1- Cargar Datos en la Agenda\n" +
                    "2- Buscar Teléfono por Nombre\n" +
                    "3- Listar Agenda");
            int opcion = sc.nextInt();
            sc.nextLine();
            while (true) {
                if (opcion == 1) {
                    System.out.println("Ingrese el nombre del contacto");
                    String contacto = sc.nextLine();
                    System.out.println("Ingrese el numero de " + contacto);
                    long numeroTelefono = sc.nextLong();
                    agenda.put(contacto, numeroTelefono);
                    sc.nextLine();
                    System.out.println("¿Desea ingresar otro contacto?(s/n)");
                    String condicionWhileContacto = sc.nextLine();
                    condicionWhileContacto = condicionWhileContacto.toLowerCase();
                    if (condicionWhileContacto.equals("n")) break;

                } else if (opcion == 3) {
                    System.out.println(agenda);
                    break;

                } else if (opcion == 2) {
                    System.out.println("Ingrese el nombre del contacto a buscar");
                    String contactoBusqueda = sc.nextLine();
                    boolean condicionBusqueda = agenda.containsKey(contactoBusqueda);
                    if (condicionBusqueda){
                        System.out.println("El contacto fue" +
                                " encontrado este es su numero " + agenda.get(contactoBusqueda));
                    }else{
                        System.out.println("El nombre no esta resgistrado");
                    }
                    break;
                }
            }
        }
    }

}

