package cursojava.datas_em_java;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class DatasEmJavaInstante {

    public static void main(String[] args) throws ParseException, InterruptedException {

        Instant inicio = Instant.now();

        Thread.sleep(2000);  /*Pode ser um tempo qualquer que não conhecemos*/

        Instant ifinal = Instant.now();

        Duration duracao = Duration.between(inicio, ifinal);

        System.out.println("Duração em nanosegundos: " + duracao.toNanos());
    }
}
