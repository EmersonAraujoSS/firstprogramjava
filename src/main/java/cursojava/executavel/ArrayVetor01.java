package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor01 {

    public static void main(String[] args) {

        double[] notass = {8.5, 8.8, 9,5, 9,8};
        double[] notasLogica = {7.6, 8.7, 9,5, 9,8};


        Aluno aluno = new Aluno();
        aluno.setNome("Emerson Araujo dos Santos Silva");
        aluno.setNomeEscola("CACN");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Java");
        disciplina.setNota(notass);
        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("SQL");
        disciplina2.setNota(notasLogica);
        aluno.getDisciplinas().add(disciplina2);


        //--------------------------------------------------------

        Aluno[] arrayAlunos = new Aluno[1];
        arrayAlunos[0] = aluno;

        for (int pos = 0; pos < arrayAlunos.length; pos++) {
            System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());

            for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
                System.out.println("Nome da disciplina é: " + d.getDisciplina());

                for (int posnota = 0; posnota < d.getNota().length; posnota++) {
                    System.out.println("A nota número " + posnota + " é igual: " + d.getNota()[posnota]);
                }
            }
        }
    }
}
