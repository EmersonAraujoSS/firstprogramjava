package cursojava.datas_em_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataVencimentoEmJava {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2024");

        Date dataAtualHoje = simpleDateFormat.parse("07/04/2024");

        if(dataVencimentoBoleto.after(dataAtualHoje)){  /*Posterior ou maior ou depois da data atual*/
            System.out.println("Boleto não está vencido");
        }else {
            System.out.println("Boleto vencido");
        }

    }

}

