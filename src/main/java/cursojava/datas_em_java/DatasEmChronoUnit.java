package cursojava.datas_em_java;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmChronoUnit {

    public static void main(String[] args) throws ParseException {

        //Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2024");

        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2024-02-01"), LocalDate.now());

        System.out.println("Possui " + dias + " dias entre a faixa de datas");
    }
}
