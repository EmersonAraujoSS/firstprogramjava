package cursojava.arquivos;

import cursojava.classes.PessoaTesteTXT;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class arquivos {

    public static void main(String[] args) throws IOException {

        /*Escrevendo em arquivo TXT*/

        PessoaTesteTXT pessoa1 = new PessoaTesteTXT();
        pessoa1.setEmail("mcemerson@gmail.com");
        pessoa1.setIdade(21);
        pessoa1.setNome("Emerson Araujo");

        PessoaTesteTXT pessoa2 = new PessoaTesteTXT();
        pessoa2.setEmail("pdmpadmp@gmail.com");
        pessoa2.setIdade(20);
        pessoa2.setNome("Araujo silva");

        PessoaTesteTXT pessoa3 = new PessoaTesteTXT();
        pessoa3.setEmail("pdmpvsfsadmp@gmail.com");
        pessoa3.setIdade(22);
        pessoa3.setNome("Silva silva");

        List<PessoaTesteTXT> pessoaTesteTXTS = new ArrayList<PessoaTesteTXT>();
        pessoaTesteTXTS.add(pessoa1);
        pessoaTesteTXTS.add(pessoa2);
        pessoaTesteTXTS.add(pessoa3);

        File arquivo = new File("C:\\Programação\\WorkSpace\\firstprogramjava\\src\\main\\java\\cursojava\\arquivosTXT\\arquivos.csv");

        if (!arquivo.exists()){
            arquivo.createNewFile();
        }

        FileWriter escrever_no_arquivo = new FileWriter(arquivo);

        for (PessoaTesteTXT p : pessoaTesteTXTS){
            escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
        }

        escrever_no_arquivo.flush();
        escrever_no_arquivo.close();
    }
}