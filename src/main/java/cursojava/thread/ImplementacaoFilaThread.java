package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

    private static ConcurrentLinkedQueue<ObjetoFIlaThread> pilha_filha =
            new ConcurrentLinkedQueue<ObjetoFIlaThread>();


    public static void add(ObjetoFIlaThread objetoFIlaThread) {
        pilha_filha.add(objetoFIlaThread);
    }

    @Override
    public void run() {

        System.out.println("fila rodando");

        while (true) {

            synchronized (pilha_filha) { /*Bloquear o acesso a essa lista para outros processos*/

                Iterator iteracao = pilha_filha.iterator();

                while (iteracao.hasNext()) {    /*Enquanto conter dados na lista irá processar*/

                    ObjetoFIlaThread processar = (ObjetoFIlaThread) iteracao.next(); /*Pega o objeto atual*/

                    /*Processar 10 mil notas fiscais*/
                    /*Gerar uma lista enorme de pdf*/
                    /*Gerar um envio em massa de email*/
                    System.out.println("-----------------------------------------");

                    System.out.println(processar.getEmail());
                    System.out.println(processar.getNome());
                    iteracao.remove();

                    try {
                        Thread.sleep(1000);    /*Dar um tempo para dar a descarga de memória*/
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            try {
                Thread.sleep(1000);   /*Processou toda a lista, dá um tempo para a limpeza de memória*/
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

