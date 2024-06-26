package cursojava.datas_em_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmCalendar {

    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance(); /*Pega a data atual*/

        /*Simular que a data vem do banco de dados*/

        calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2024")); /*Definindo uma data qualquer*/

        calendar.add(Calendar.DAY_OF_MONTH,5);

        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
    }
}
