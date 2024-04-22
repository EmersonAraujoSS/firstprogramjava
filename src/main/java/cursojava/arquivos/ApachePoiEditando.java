package cursojava.arquivos;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.Iterator;

public class ApachePoiEditando {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Programação\\WorkSpace\\firstprogramjava\\src\\main\\java\\cursojava\\arquivos\\arquivo.xls");

        FileInputStream entrada = new FileInputStream(file);

        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);  /*Prepara a entrada do arquivo excel para ler*/
        HSSFSheet planilha = hssfWorkbook.getSheetAt(0);  /*Pega a primeira planilha do nosso arquivo excel*/

        Iterator<Row> linhaIterator = planilha.iterator();  /*percorrer as linhas*/

        while (linhaIterator.hasNext()){  /*enquanto tiver linha*/
            Row linha = linhaIterator.next(); /*dados da pessoa na linha*/

            int numeroCelulas = linha.getPhysicalNumberOfCells();   /*quantidade de células*/

            Cell cell = linha.createCell(numeroCelulas);  /*cria nova célula na linha*/
            cell.setCellValue("2.500,20");
        }

        entrada.close();

        FileOutputStream saida = new FileOutputStream(file);
        hssfWorkbook.write(saida);
        saida.flush();
        saida.close();

        System.out.println("Planilha atualizada");
    }
}
