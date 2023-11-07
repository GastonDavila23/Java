// Clase: Alumno
// Atributos: nombreCompleto(string), legajo (long), ArrayList de objetos Nota
// Clase: Nota
// Atributos: catedra (string), notaExamen(double)
//Clase: CargaNotas
//  (clase que tendrá declarado el método main para ejecutar el código.)
//En la clase CargaNotas debera declarar una variable que permita contener un conjunto de Alumnos:
//  Ejemplo:
//  ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
//El algoritmo debe permitir cargar N cantidad de alumnos y para cada alumno N cantidad de Notas.
//Al finalizar la carga de los alumnos y sus notas mostrar la información cargada
//y para cada alumno mostrar el promedio de las notas que posee.
//Valide que se ingrese al menos 1 nota.
//Agregue en la clase Alumno un método público que calcule el promedio de las notas que posee.
//
import java.util.ArrayList;
import java.util.Scanner;

public class CargarNota {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre completo del alumno");
            alumno.setNombre_completo(sc.next());
            System.out.println("Ingrese el numero de legajo");
            alumno.setLegajo(sc.nextLong());
            ArrayList<Nota> notas = new ArrayList<Nota>();
            do {
                Nota nota = new Nota();
                System.out.println("Ingrese las notas del alumno");
                System.out.println("Nombre de la Materia");
                nota.setMateria(sc.next());
                System.out.println("Calificacion");
                nota.setNota_examen(sc.nextDouble());
                notas.add(nota);
                System.out.println("Desea ingresar mas notas?(s/n");

                if (sc.next().equals("n")){
                    alumno.setNotas(notas);
                    break;
                }

            }while(true);

            alumnos.add(alumno);

            System.out.println("Desea ingresar otro alumno?(s/n)");
            if (sc.next().equals("n")){
                break;
            }

        }while (true);

        Promedio_notas(alumnos);


    }

    public static void Promedio_notas(ArrayList<Alumno> alumnos){
        double suma = 0;
        double promedio = 0;
        for (Alumno alumno: alumnos) {
            for (Nota nota: alumno.getNotas()) {
                suma = suma + nota.getNota_examen();
            }
            promedio = suma / alumno.getNotas().size();
            System.out.println(alumno.getNombre_completo() + " Promedio: "+ promedio);
            suma = 0;
        }
    }
}
