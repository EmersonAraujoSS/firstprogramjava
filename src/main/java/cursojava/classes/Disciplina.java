package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

/*ESSA CLASSE DISCIPLINA SERVIRÁ PARA TODOS OS OBJETOS E INSTANCIAS DE NOTAS E MATERIAS*/
public class Disciplina {

    private double[] nota = new double[4];
    private String disciplina;


    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getMediaNotas(){

        double somaTotal = 0;

        for (int posicao = 0; posicao < nota.length; posicao++){
            somaTotal += nota[posicao];
        }
        return somaTotal / 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Arrays.equals(nota, that.nota) && Objects.equals(disciplina, that.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota, disciplina);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
