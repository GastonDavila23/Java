//Codifique la clase celda con los atributos:
// int fila;
// int columna;
// String valor;
//
public class Celda {

    private Integer fila;
    private Integer columna;
    private String valor;

    public Celda(Integer fila,Integer columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }
    public Integer getFila() {
        return fila;
    }

    public void setColumna(Integer columna) {
        this.columna = columna;
    }
    public Integer getColumna() {
        return columna;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return "Celda{" + "fila=" + fila + ", columna=" + columna + ", valor='" + valor + '\'' + '}';
    }
}
