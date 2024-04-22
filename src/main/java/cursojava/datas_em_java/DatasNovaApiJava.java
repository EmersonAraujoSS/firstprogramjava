package cursojava.datas_em_java;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasNovaApiJava {

    public static void main(String[] args) throws ParseException {

        /*Nova API de data a partir do Java 8*/

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));  /*  ofParttern  serve para organizar as datas no formato que vc definir*/


        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Hora e data atual: " + localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
