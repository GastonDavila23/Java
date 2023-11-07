import java.util.ArrayList;
public class Alumno {

    private String nombre_completo;
    private Long legajo;
    private ArrayList<Nota> notas;

    public Alumno() {
    }

    public Alumno(String nombre_completo, Long legajo, ArrayList<Nota> notas) {
        this.nombre_completo = nombre_completo;
        this.legajo = legajo;
        this.notas = notas;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public Long getLegajo() {
        return legajo;
    }

    public void setLegajo(Long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre_completo='" + nombre_completo + '\'' + ", legajo=" + legajo + ", notas=" + notas + '}';
    }
}
