package cursojava.arquivos;

import cursojava.classes.PessoaTesteTXT;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApachePoi {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Programação\\WorkSpace\\firstprogramjava\\src\\main\\java\\cursojava\\arquivos\\arquivo.xls");

        if (!file.exists()){
            file.createNewFile();
        }

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

        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();  /*HSSFWorkbook = vai ser usado para escrever a planilha*/
        HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas Jdev Treinamento");  /*Vai ser usado para criar a planilha*/

        int numeroLinha = 0;
        for (PessoaTesteTXT p : pessoaTesteTXTS){
            Row linha = linhasPessoa.createRow(numeroLinha++);   /*Criando a linha da planilha*/

            int celula = 0;

            Cell cellNome = linha.createCell(celula ++); /*Cria a celula 1*/
            cellNome.setCellValue(p.getNome());

            Cell cellEmail = linha.createCell(celula ++);  /*Cria a celula 2*/
            cellEmail.setCellValue(p.getEmail());

            Cell cellIdade = linha.createCell(celula ++);  /*Cria a celula 3*/
            cellIdade.setCellValue(p.getIdade());

        }/*Terminou de montar a planilha*/

        FileOutputStream saida = new FileOutputStream(file);
        hssfWorkbook.write(saida);  /*Escreve planilha em arquivo*/
    }
}
