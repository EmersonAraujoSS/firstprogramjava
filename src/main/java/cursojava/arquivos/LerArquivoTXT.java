package cursojava.arquivos;

import cursojava.classes.PessoaTesteTXT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTXT {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream entradaArquivo =
                new FileInputStream(new File("C:\\Programação\\WorkSpace\\firstprogramjava\\src\\main\\java\\cursojava\\arquivosTXT\\arquivos.csv"));

        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

        List<PessoaTesteTXT> pessoaTesteTXTS = new ArrayList<PessoaTesteTXT>();

        while (lerArquivo.hasNext()){      /*hasNext = tiver dados  (enquanto meu arquivo tiver dados)*/
            String linha = lerArquivo.nextLine();

            if (linha != null && !linha.isEmpty()){  /*isEmpty  ( se a minha linha estiver diferente de vazia)*/

                String[] dados = linha.split(";");

                if(dados.length == 3) {    // Verifica se a linha possui todos os dados esperados
                    PessoaTesteTXT pessoaTesteTXT = new PessoaTesteTXT();
                    pessoaTesteTXT.setNome(dados[0]);
                    pessoaTesteTXT.setEmail(dados[1]);
                    pessoaTesteTXT.setIdade(Integer.parseInt(dados[2]));

                    pessoaTesteTXTS.add(pessoaTesteTXT);
                }else {
                    System.out.println("Erro: Formato de linha inválido: " + linha);
                }
            }
        }
        // Imprime as pessoas lidas do arquivo
        for (PessoaTesteTXT pessoaTesteTXT : pessoaTesteTXTS){
            System.out.println(pessoaTesteTXT);
        }

        // Fechar recursos
        lerArquivo.close();
    }
}
