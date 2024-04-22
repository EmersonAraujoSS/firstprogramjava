package cursojava.arquivos;

import cursojava.classes.PessoaTesteTXT;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ApachePoi2 {

    public static void main(String[] args) throws IOException {

        FileInputStream entrada = new FileInputStream(new File("C:\\Programação\\WorkSpace\\firstprogramjava\\src\\main\\java\\cursojava\\arquivos\\arquivo.xls"));

        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);  /*Prepara a entrada do arquivo excel para ler*/
        HSSFSheet planilha = hssfWorkbook.getSheetAt(0);  /*Pega a primeira planilha do nosso arquivo excel*/

        Iterator<Row> linhaIterator = planilha.iterator();  /*percorrer as linhas*/

        List<PessoaTesteTXT> pessoaTesteTXTS = new ArrayList<PessoaTesteTXT>();

        while (linhaIterator.hasNext()){  /*enquanto tiver linha no arquivo excel*/
            Row linha = linhaIterator.next();  /*Dados da pessoa na linha*/

            Iterator<Cell> celula = linha.iterator();

            PessoaTesteTXT pessoaTesteTXT = new PessoaTesteTXT();

            while (celula.hasNext()){   /*Percorre a célula*/
                Cell cell = celula.next();

                switch (cell.getColumnIndex()){
                    case 0:
                        pessoaTesteTXT.setNome(cell.getStringCellValue());
                        break;
                    case 1:
                        pessoaTesteTXT.setEmail(cell.getStringCellValue());
                        break;
                    case 2:
                        pessoaTesteTXT.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
                        break;
                }
            }  /*Fim das celulas da linha*/

            pessoaTesteTXTS.add(pessoaTesteTXT);
        }

        entrada.close();  /*Termina de ler o arquivo excel*/

        for (PessoaTesteTXT pessoaTesteTXT : pessoaTesteTXTS) {
            System.out.println(pessoaTesteTXT);

        }
    }
}
