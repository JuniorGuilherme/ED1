package ListaEncadeada;

import java.util.Scanner;

/**
 * Created by jrg_c on 18/10/2016.
 */
public class Principal {
    public static void main(String[] args) {
        Lista list = new Lista();
        Elemento a = new Elemento();
        Scanner tc = new Scanner(System.in);
        int op;
        do{
            System.out.println("1 == Adicionar no Fim | 2 == Adicionar no Inicio | 3 == Adicionar na Posição");
            System.out.println("4 == Del no Inicio | 5 == Del na Posição | 6 == Del no Fim");
            System.out.println("7 == Listar | 8 == Buscar Elemento | 9 == Sair");
            op=tc.nextInt();
            switch (op){
                case 1: {
                    Elemento e = new Elemento();
                    e.ler();
                    list.addFim(e);
                    break;
                }
                case 2: {
                    Elemento e = new Elemento();
                    e.ler();
                    list.addInicio(e);
                    break;
                }
                case 3:{

                    list.addPosicao();
                    break;
                }
                case 4: {
                    list.delPosicao();
                    break;
                }
                case 7: {
                    list.listar();
                    break;
                }
            }
        }while(op!=9);
    }
}