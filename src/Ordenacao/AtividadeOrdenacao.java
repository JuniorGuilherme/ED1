package Ordenacao;

import java.util.Random;

/**
 * Created by Junior Guilherme on 16/10/2016.
 */
public class AtividadeOrdenacao {
    public static void mostrar(int[] x){
        System.out.println("Ordenacao:");
        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
    }
    public static void main(String[] args) {
        int vetor1[] = new int[100000], vetor2[] = new int[100000], vetor3[] = new int[100000];
        long elapsed1, elapsed2, elapsed3;
        Random gerador = new Random();
        MetodosSorts ms = new MetodosSorts();
        //Loop para atribuicao dos numeros randomicos aos vetores.
        System.out.println("Vetor desordenado: ");
        for(int i =0; i<vetor1.length; i++){
            vetor1[i]=gerador.nextInt(100000);
            System.out.println(vetor1[i]);
            vetor2[i]=vetor1[i];
            vetor3[i]=vetor1[i];
        }
        //Chamada dos metodos de ordenacao com retorno em Milisegundos para as variaveis longs.
        elapsed3 = ms.bubleSort(vetor1);
        elapsed1 = ms.selectSort(vetor2);
        elapsed2 = ms.insertSort(vetor3);
        //Metodo mostrar apenas para verificacao de fidelidade dos metodos de ordenacao.
        //Nao testar com muitos elementos nos vetores.

        //mostrar(vetor1);
        //mostrar(vetor2);
        //mostrar(vetor3);

        //Exibicao dos times dos metodos de ordenacao.
        System.out.println("Tempos de Execucao");
        System.out.println("Selection Sort: "+elapsed1+" ms");
        System.out.println("Insertion Sort: "+elapsed2+" ms");
        System.out.println("Bublle Sort: "+elapsed3+" ms");
    }
}
