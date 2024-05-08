package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrimeiraClasseJava {

    /* Main é o método auto executavel em Java */
    /*Usado para executar código*/
    public static void main (String[] args) {

        try {

        String login = JOptionPane.showInputDialog("Informe o login");
        String senha = JOptionPane.showInputDialog("Informe a senha");


            PermitirAcesso permitirAcesso = new Diretor(login, senha);

        if (new FuncaoAutenticacao(permitirAcesso).autenticar()) {

            List<Aluno> alunos = new ArrayList<Aluno>();

            /*é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também*/
            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


            for (int quantidade = 1; quantidade <= 1; quantidade++) {

                /* Agora temos um objeto real na memoria */
                /* new Aluno() é uma instancia (Criação de um objeto) */
                /* aluno1 é uma referencia para o objeto aluno */

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + quantidade + " ?");
        String idade = JOptionPane.showInputDialog("Qual a idade? ");
        /*String dataNascimento = JOptionPane.showInputDialog("Qual a data do nascimento? ");
        String rg = JOptionPane.showInputDialog("Qual o Registro Geral? ");
        String cpf = JOptionPane.showInputDialog("Qual o cpf? ");
        String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe? ");
        String nomepai = JOptionPane.showInputDialog("Qual o nome do pai? ");
        String DataMatricula = JOptionPane.showInputDialog("Qual a data da matricula? ");
        String SerieMatriculado = JOptionPane.showInputDialog("Qual a serie matriculado? ");
        String NomeEscola = JOptionPane.showInputDialog("Qual o nome da escola? ");*/


        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
       /* aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomepai);
        aluno1.setDataMatricula(DataMatricula);
        aluno1.setSerieMatriculado(SerieMatriculado);
        aluno1.setNomeEscola(NomeEscola);*/

                for (int pos = 1; pos <= 1; pos++) {
                    String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
                    String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + "?");

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                  //  disciplina.setNota(Double.parseDouble(notaDisciplina));

                    aluno1.getDisciplinas().add(disciplina);
                }

                int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
                if (escolha == 0) {  /*Opção SIM é zero*/
                    int continuarRemovendo = 0;
                    int posicao = 1;

                    while (continuarRemovendo == 0) {
                        String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina, 1,2,3 ou 4? ");
                        aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                        posicao++;
                        continuarRemovendo = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
                    }
                }
                alunos.add(aluno1);
            }

            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

            for (Aluno aluno : alunos) {
                if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);
                } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
                    maps.get(StatusAluno.REPROVADO).add(aluno);
                }
            }

            System.out.println("-----------Lista dos Aprovados-----------");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Resultado: " + aluno.getAlunoAprovado2() + " com média de: " + aluno.getMediaNota());
            }

            System.out.println("-----------Lista dos Recuperacao-----------");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Resultado: " + aluno.getNome() + aluno.getAlunoAprovado2() + " com média de: " + aluno.getMediaNota());
            }

            System.out.println("-----------Lista dos Reprovados-----------");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Resultado: " + aluno.getAlunoAprovado2() + " com média de: " + aluno.getMediaNota());
            }

            /* Equals e Hashcode (Diferenciar e comparar objetos) */

       /* aluno1 = new Aluno();
        aluno1.setNome("Emerson");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Emerson");

        if (aluno1.equals(aluno2)){
            System.out.println("Alunos são iguais");
        }else {
            System.out.println("Alunos não são iguais");
        }  */
        }else{
            JOptionPane.showMessageDialog(null, "Acesso não permitido");
        }

    }catch (NumberFormatException e){
            StringBuilder saida = new StringBuilder();

            /*Imprime erro no console Java*/
            e.printStackTrace();

            /*Mensagem do erro ou causa CUSTOMIZADA*/
            System.out.println("Mensagem: " + e.getMessage());

            for (int posicao = 0; posicao < e.getStackTrace().length; posicao++){

                saida.append("\n Classe de erro: " +e.getStackTrace()[posicao].getClassName());   /*append SIGNIFICA ADICIONAR*/
                saida.append("\n Método de erro: " +e.getStackTrace()[posicao].getMethodName());
                saida.append("\n Linha de erro: " +e.getStackTrace()[posicao].getLineNumber());
                saida.append("\n Class: " +e.getClass().getName());
            }

            JOptionPane.showMessageDialog(null, "Erro de conversão de numero" + saida.toString());

        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Erro de null pointer exception: " +e.getClass());

        }catch (Exception e){ /*capturar todas as excecoes que não provemos*/
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro inesperado: " +e.getClass().getName());

        }finally { /*sempre é executado ocorrendo erros ou não*/
            JOptionPane.showMessageDialog(null, "Finally sempre é executado ocorrendo erros ou não");
        }


    }
}
