//Indique cual es la diferencia entre los datos primitivos (por valor)
//ejemplo el int y su contraparte por referencia ejemplo Integer.
//
public class ej_14 {
    public static void main (String[] args){
        // La principal diferencia es el almacenamiento de datos y manejo de memoria.
        // Los tipos de datos primitivos son almacenados directamente en la memoria, mientras que,
        // los tipos por referencia se almacenan en el heap.

        //Dato Primitivo
        // Se copia el valor de 'a' en 'b'
        int a = 7;
        int b = a;

        //Dato por Referencia
        // 'x' y 'y' apuntan al mismo objeto en el heap
        Integer x = 3;
        Integer y = x;
    }
}
