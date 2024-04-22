package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestatandoClassesFilhas {

    /*Usado para executar código*/

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Emerson Araujo");
        aluno.setNomeEscola("CACN");
        aluno.setIdade(21);

        Diretor diretor = new Diretor();
        diretor.setNome("Castelo");
        diretor.setRegistroGeral("29952271");
        diretor.setIdade(35);

        Secretario secretario = new Secretario();
        secretario.setNome("Lara Rocha");
        secretario.setExperiencia("Administração");
        secretario.setIdade(30);

        aluno.pessoaMaioridade();
        diretor.pessoaMaioridade();
        secretario.pessoaMaioridade();

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaioridade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaioridade());
        System.out.println(secretario.pessoaMaioridade());

        System.out.println("Salário do aluno é: " + aluno.salario());
        System.out.println("Salário do diretor é: " + diretor.salario());
        System.out.println("Salário do secretário é: " + secretario.salario());

    }
}
