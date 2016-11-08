package LummertzExport;

import java.util.Scanner;

/**
 * Created by Junior Guilherme on 08/11/2016.
 */
public class LummertzExport {
    public static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        int op=0;
        Pilha p = new Pilha();
        do{
            System.out.println("1- Adicionar Pilha de Conteiner");
            System.out.println("2- Remover Container");
            op=tc.nextInt();
            switch(op){
                case 1:{
                    Conteiner c = new Conteiner();
                    c.ler();
                    p.addInicio(c);
                }
            }
        }while(op!=5);
    }
}
