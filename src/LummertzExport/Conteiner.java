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
        System.out.println("Digite o codigo:");
        Scanner tc = new Scanner(System.in);
        codigo=tc.next();
        System.out.println("Digite o pais:");
        pais=tc.next();
        System.out.println("Digite o tipo:");
        tipo=tc.next();
    }
}
