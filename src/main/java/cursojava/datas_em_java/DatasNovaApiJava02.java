package cursojava.datas_em_java;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasNovaApiJava02 {

    public static void main(String[] args) throws ParseException {

        LocalDate localDate = LocalDate.now();
        System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
        System.out.println("Dia do mês: " + localDate.getDayOfMonth());
        System.out.println("Dia do ano: " + localDate.getDayOfYear());
        System.out.println("Mês atual: " + localDate.getMonth());
    }
}
