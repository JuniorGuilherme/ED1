package LummertzExport;

import java.util.Scanner;
/**
 * Created by Junior Guilherme on 08/11/2016.
 */
public class Conteiner {
    String codigo, pais, tipo;
    Long time;
    Conteiner proximo;

    public void ler(){
        for(int i=0; i<5; i++) {
            System.out.println("Conteiner["+(i+1)+"]:");
            System.out.println("Digite o codigo:");
            Scanner tc = new Scanner(System.in);
            codigo = tc.next();
            System.out.println("Digite o pais:");
            pais = tc.next();
            System.out.println("Digite o tipo:");
            tipo = tc.next();
        }
    }
}
