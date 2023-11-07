//Desarrolle un programa que ayude a una cajera a determinar el número de billetes y monedas que se necesitan
//de cada una de las siguientes denominaciones 200, 100, 50, 20, 10, 5, 2 y 1,
//y monedas de 0.50, 0.25, 0.10 y 0.05 centavos para una cantidad de dinero dada.
//Ejemplo si la cantidad es 1390,55 se necesitan 6 billetes de 200, 1 billete de 100, 1 billete de 50, 2 billetes de 20, 1 moneda de 0.50 y una moneda de 0.05 centavos.
//
public class ej_4 {
    public static void main(String[] args){

        double cantidad = 1390.55;

        int[] billetes = {200,100,50,20,10,5,2,1};
        double[] monedas = {0.50,0.25,0.10,0.05};

        for (int billete : billetes) {
            int cantidadBilletes = (int) (cantidad / billete);
            if (cantidadBilletes > 0) {
                System.out.println(cantidadBilletes +" billete(s) de "+ billete);
                cantidad %= billete;
            }
        }

        for (double moneda : monedas) {
            int cantidadMonedas = (int) (cantidad / moneda);
            if (cantidadMonedas > 0) {
                System.out.println(cantidadMonedas +" moneda(s) de "+ moneda +" centavos");
                cantidad %= moneda;
            }
        }
    }
}
