package cursojava.classes;

import com.sun.javafx.image.PixelUtils;
import com.sun.scenario.effect.impl.prism.PrImage;
import cursojava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.SplittableRandom;

/* esta é a classe/objeto que representa o Aluno */
public class Aluno extends Pessoa {

    /* Esses são os atributos do Aluno */

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Aluno(){   /* Cria os dados na memoria - Sendo padrão do Java */

    }
    public Aluno (String nomePadrao){
        nome = nomePadrao;
    }
    public Aluno (String nomePadrao, int idadePadrao){
        nome = nomePadrao;
        idade = idadePadrao;
    }
    /* Veremos os métodos SETTERS E GETTERS do objeto */
    /* SET é para adicionar ou receber dados para os atributos */
    /* GET é para resgatar ou obter o valor do atributo */


    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public void setNome(String nome){
       this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    public String getNomeEscola() {
        return nomeEscola;
    }
    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }
    public String getSerieMatriculado() {
        return serieMatriculado;
    }
    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    /* Método que retorna a média do aluno */
    public double getMediaNota(){

        double somaNotas = 0.0;
        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getMediaNotas();

        }

        return somaNotas / disciplinas.size();  /*SIZE ele retorna quantas disciplinas tem na minha lista*/
    }

    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if (media >= 70){
            return true;
        }else {
            return false;
        }
    }

    public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if (media >= 50) {
            if (media >= 70) {
                return StatusAluno.APROVADO;
            } else {
                return StatusAluno.RECUPERACAO;
            }
        }else {
            return StatusAluno.REPROVADO;
        }
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplina=" ;
    }

    @Override /*identifica método sobrescrito*/
    public boolean pessoaMaioridade() {
        return super.pessoaMaioridade();
    }

    public String msgMaiorIdade(){
        return this.pessoaMaioridade() ? "Blz, vc é maior de idade" : "Opa, vc é menor de idade";
    }

    @Override /*EQUALS E HASHCODE serve para diferenciar ou comparar se objetos são iguais */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(numeroCpf, aluno.numeroCpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroCpf);
    }

    @Override
    public double salario() {
        return 1500.90;
    }
}
