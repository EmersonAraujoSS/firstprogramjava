package cursojava.executavel;

import java.util.Arrays;

public class CriacaoArrayDeNotas {

    //Criando um ARRAY de notas
    public static void main(String[] args) {

        double[] notas = new double[4];
        notas[0] = 10;
        notas[1] = 20;
        notas[2] = 30;
        notas[3] = 40;

        for (int posicao = 0; posicao < notas.length; posicao++) {    /* length = ele retorna um inteiro do tamanho do nosso array*/
            System.out.println("Nota " + (posicao + 1) + " é: " + notas[posicao]);    /* (posicao + 1) = é para ele ajustar a nota e não começar por zero*/
        }
    }
}
