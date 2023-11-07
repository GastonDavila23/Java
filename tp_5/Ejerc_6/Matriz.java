//Crea una clase Matriz que contenga una variable global ArrayList<Celda>
//ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
//
import java.util.ArrayList;

public class Matriz {

    ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();

    public void agregarCelda(Celda celda) {
        matrizCuadrada.add(celda);
    }

    public String obtenerValor(int fila, int columna) {
        for (Celda celda : matrizCuadrada) {
            if (celda.getFila() == fila && celda.getColumna() == columna) {
                return celda.getValor();
            }
        }
        return "La fila y columna indicada no ha sido asignada";
    }

}
