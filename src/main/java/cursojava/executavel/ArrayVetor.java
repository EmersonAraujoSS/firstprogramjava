package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import java.io.PrintStream;

public class ArrayVetor {

    /*Usado para executar código*/
    public static void main(String[] args){

        String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter? ");

    /*Array pode ser de todos os tipos de dados e objetos também*/
    //Criação de um ARRAY
    /*Array sempre deve ter a quantidade de posições definidas*/
        double[] notas = new double[Integer.parseInt(posicoes)];

        for (int posicao = 0; posicao < notas.length; posicao ++){
            String valor = JOptionPane.showInputDialog("Qual o valor da posição? " + posicao);
            notas[posicao] = Double.parseDouble(valor);
        }

        for (int posicao = 0; posicao < notas.length; posicao++){
            System.out.println("Nota " + (posicao + 1) + " é: " + notas[posicao]);
        }




        String[] valores = new String[4];

        valores[0] = "Emerson";
        valores[1] = "21";
        valores[2] = "Curso de Java";
        valores[3] = "contato@jdevtreinamento.com.br";

        for (int posicao = 0; posicao < valores.length; posicao++){
            System.out.println("Valor na posição " + posicao + " é igual: " + valores[posicao]);
        }




        double[] notass = {8.6, 8.8, 9,5, 9,8};
        double[] notasLogica = {7.6, 8.8, 9,5, 9,8};


        Aluno aluno = new Aluno();
        aluno.setNome("Emerson Araujo dos Santos Silva");
        aluno.setNomeEscola("Estacio");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Java");
        disciplina.setNota(notass);
        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Logica de programação");
        disciplina2.setNota(notasLogica);
        aluno.getDisciplinas().add(disciplina2);


        for (Disciplina d : aluno.getDisciplinas()){
            System.out.println("Nome do aluno: " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
            System.out.println("----------Disciplina do aluno----------");
            System.out.println("Disciplina: " + d.getDisciplina());
            System.out.println("As notas das disciplinas são: ");

            double notaMax = 0.0;   /*Descobrindo a maior nota*/
            for (int posicao =  0; posicao < d.getNota().length; posicao++){
                System.out.println("Nota " + posicao + " é igual: " + d.getNota()[posicao]);
                if (posicao == 0){
                    notaMax = d.getNota()[posicao];
                }else {
                    if (d.getNota()[posicao] > notaMax){
                        notaMax = d.getNota()[posicao];
                    }
                }
            }
            System.out.println("A maior nota da disciplina: " + d.getDisciplina() + " é de valor: " + notaMax);
        }

    }
}
