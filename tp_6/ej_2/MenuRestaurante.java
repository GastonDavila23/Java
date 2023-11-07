//Codifique las siguientes clases Java
//  Clase: Ingrediente Atributos: nombre (string), cantidad(double), unidad de medida (string)
//  Clase: Plato Atributos: nombreCompleto(string), precio (double), esBebida (boolean), ArrayList de objetos Ingrediente
//  Clase: MenuRestaurant (clase que tendrá declarado el método main para ejecutar el código.)
//Lógica a Implementar:
//  En la clase MenuRestaurant debera declarar una variable “platosMenu” que permita contener un conjunto de Platos que componen el menú de un restaurant.
// Ejemplo: ArrayList<Plato> platos = new ArrayList<Plato>();
// El algoritmo debe permitir cargar N platos y para cada plato indicar los N ingredientes que lo componen.
// Si el plato es de tipo Bebida entonces no se deben solicitar los ingredientes,
// en cambio si no lo es, será obligatorio que se asigne al menos 1 ingrediente.
// Al finalizar la carga de los platos y sus ingredientes
// mostrar la información cargada, la cual será equivalente al menú del restaurant.
//
import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Plato> menu_platos = new ArrayList<Plato>();

        do {
            Plato plato = new Plato();
            System.out.println("Ingrese el nombre del plato");
            plato.setNombre_completo(sc.next());
            System.out.println("Ingrese el valor");
            plato.setPrecio(sc.nextDouble());
            System.out.println("Es bebida?(s/n)");
            if (sc.next().equals("s")){
                plato.setBebida(true);
            }else{
                plato.setBebida(false);
            }

            if (plato.getBebida() == false){
                ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
                System.out.println("Ingrese los ingredientes");
                Ingredientes ingrediente = new Ingredientes();
                System.out.println("Nombre del ingrediente");
                ingrediente.setNombre(sc.next());
                System.out.println("Ingrese la cantida");
                ingrediente.setCantidad(sc.nextDouble());
                System.out.println("Ingrese la unidad de medida");
                ingrediente.setCantidad_medida(sc.next());
                ingredientes.add(ingrediente);
                plato.setIngredientes(ingredientes);
            }

            menu_platos.add(plato);

            System.out.println("Desea ingresar otro plato?(s/n)");
            String opcion = sc.next();
            if (opcion.equals("n")){
                break;
            }

        }while(true);

        System.out.println("-------Menu--------");
        for (Plato plato : menu_platos) {
            System.out.println(plato.toString());
        }

    }
}
