package cursojava.thread;

import javax.swing.*;

public class AulaThread {

    public static void main(String[] args) throws InterruptedException {


        Thread threadEmail = new Thread(thread1);  /*Thread processando em paralelo do envio de email*/
        threadEmail.start();


        //*********************** Divisão das threads **************************


        Thread threadNotaFiscal = new Thread(thread2); /*Thread processando em paralelo do envio de nota fiscal*/
        threadNotaFiscal.start();



        /*Codigo do sistema do usuario continua o fluxo de trabalho*/
        System.out.println("Chegou ao fim do código de teste de THREAD");

        /*Fluxo do sistema, cadastro de venda, uma emissão de nota fiscal, algo do tipo*/
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
    }

    private static Runnable thread2 = new Runnable() {
        @Override
        public void run() {

            /*Código de rotina*/

            for (int pos = 0; pos < 10; pos++){

                /*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
                System.out.println("Executando algo rotina, por exemplo envio de nota fiscal");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            /*Fim do codigo em paralelo*/

        }
    };

    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {

            /*Código de rotina*/

            for (int pos = 0; pos < 10; pos++){

                /*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
                System.out.println("Executando algo rotina, por exemplo envio de email");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            /*Fim do codigo em paralelo*/

        }
    };
}
