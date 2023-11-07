public class Nota {

    private String materia;
    private Double nota_examen;

    public Nota() {
    }

    public Nota(String materia, Double nota_examen) {
        this.materia = materia;
        this.nota_examen = nota_examen;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getNota_examen() {
        return nota_examen;
    }

    public void setNota_examen(Double nota_examen) {
        this.nota_examen = nota_examen;
    }

    @Override
    public String toString() {
        return "Nota{" + "materia='" + materia + '\'' + ", nota_examen=" + nota_examen + '}';
    }
}
