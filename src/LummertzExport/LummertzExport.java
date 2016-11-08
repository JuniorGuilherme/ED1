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
        Pilhas ps = new Pilhas();
        do{
            System.out.println("1- Adicionar Pilha de Conteiner");
            System.out.println("2- Remover Container");
            System.out.println("3- Mostrar Pilhas");
            op=tc.nextInt();
            switch(op){
                case 1:{
                    Conteiner c = new Conteiner();
                    c.ler();
                    p.addInicio(c);
                    ps.addInicio(p);
                }
                break;
                case 3:{
                    ps.mostrar();
                }
                break;
            }
        }while(op!=5);
    }
}
