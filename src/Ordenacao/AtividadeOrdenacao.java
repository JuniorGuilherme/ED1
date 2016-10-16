package Ordenacao;

import java.util.Random;

/**
 * Created by Junior Guilherme on 16/10/2016.
 */
public class AtividadeOrdenacao {
    public static void main(String[] args) {
        int vetor1[] = new int[20], vetor2[], vetor3[];
        Random gerador = new Random();
        MetodosSorts ms = new MetodosSorts();

        for(int i =0; i<vetor1.length; i++){
            vetor1[i]=gerador.nextInt(10000);
            System.out.println(vetor1[i]);
        }
        vetor2=vetor1;
        vetor3=vetor1;
    }
}
