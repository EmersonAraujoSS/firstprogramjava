package cursojava.datas_em_java;

import cursojava.classes.Pessoa;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DatasEmJavaPeriod {

    public static void main(String[] args) throws ParseException {

        LocalDate dataAntiga = LocalDate.of(2020,2,7);

        LocalDate dataNova = LocalDate.of(2024,7,4);

        System.out.println("A data antiga é maior que a data nova? " + dataAntiga.isAfter(dataNova));
        System.out.println("As datas são iguais? " + dataAntiga.isEqual(dataNova));

        Period periodo = Period.between(dataAntiga, dataNova);
        System.out.println("Quantos dias? " + periodo.getDays());
        System.out.println("Quantos meses: " + periodo.getMonths());
        System.out.println("Quantos anos: " + periodo.getYears());
        System.out.println("O período é: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias");
    }
}
