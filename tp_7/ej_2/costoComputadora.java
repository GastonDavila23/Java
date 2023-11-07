package ej_2;

import java.util.Scanner;

public class costoComputadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costoTotal = 0.0;
        while (true) {
            System.out.println("Ingrese la marca de la computadora");
            String marca = sc.nextLine();
            System.out.println("Ingrese el modelo de la computadora");
            String modelo = sc.nextLine();
            Computadora computadora = new Computadora(marca, modelo);
            while (true) {
                System.out.println("Ingrese el componente de la computadora");
                String componente = sc.nextLine();
                System.out.println("Ingrese la marca del componente");
                String marcaComponente = sc.nextLine();
                System.out.println("Ingrese la cantidad del componente");
                int cantidadComponente = sc.nextInt();
                System.out.println("Ingrese el precio del componente");
                double precioComponente = sc.nextDouble();
                sc.nextLine();
                double subTotal = cantidadComponente * precioComponente;
                costoTotal += subTotal;
                System.out.println(componente + " " + marcaComponente
                        + " " + cantidadComponente + " " + precioComponente + " " + subTotal);
                computadora.añadirComponente(new componenteCPU(componente, marcaComponente, cantidadComponente, precioComponente));
                System.out.println("Quiere ingresar un nuevo componente? si/no");
                String condicionSalidaWhile1 = sc.nextLine();
                if (condicionSalidaWhile1.equals("no")) break;
            }
            double precioSugerido;
            if (costoTotal < 50000) {
                precioSugerido = costoTotal + (costoTotal * 0.4);
            } else {
                precioSugerido = costoTotal + (costoTotal * 0.3);
            }
            System.out.println("-----------Computadora----------------");
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Componentes:");
            System.out.println("Componente Marca Cantidad Precio X Unidad SubTotal");
            for (componenteCPU componente : computadora.componentes) {
                System.out.println(componente);
            }
            System.out.println("Costo Total: " + costoTotal);
            System.out.println("El precio sugerido de venta es: " + costoTotal + " + " + (precioSugerido - costoTotal) + " = " + precioSugerido);
            System.out.println("¿Desea ingresar otra computadora? si/no ");
            String condicionSalidaWhile2 = sc.nextLine();
            if (condicionSalidaWhile2.equals("no")) break;
        }
    }
}



