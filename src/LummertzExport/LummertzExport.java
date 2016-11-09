package LummertzExport;

import java.util.Scanner;

/**
 * Created by Junior Guilherme on 08/11/2016.
 */
public class LummertzExport {
    public static Scanner tc = new Scanner(System.in);

    public static boolean alertaContainers(Long alertaContainer){
        Long atual = (System.currentTimeMillis() - alertaContainer)/60000;
        if(atual>=((1440-atual)/60)){
            System.out.println("5 novos containers chegaram.");
            return true;
        }
        else {
            System.out.println("Em "+((1440-atual)/60)+"h, 5 novos containers chegarão.");
            return false;
        }
    }

    public static void main(String[] args) {
        int op;
        Long alertaContainer = System.currentTimeMillis();

        List A = new List();
        List B = new List();
        List C = new List();
        List D = new List();

        do {
            System.out.println("1- Adicionar Conteiner");
            System.out.println("2- Remover Container");
            System.out.println("3- Mostrar Plhas");
            System.out.println("4- Atualizar Pereciveis");
            System.out.println("5- Alertas de Container");
            System.out.println("Resumo de chegada de containers: ");
            if(alertaContainers(alertaContainer)){
                alertaContainer=System.currentTimeMillis();
            }
            op = tc.nextInt();
            switch (op) {
                case 1: {
                    Conteiner c = new Conteiner();
                    char esc;
                    c.ler();
                    if (c.isPerecivel(c)) {
                        System.out.println("Qual pilha deseja adicionar? A ou B?");
                        do {
                            esc = tc.next().toUpperCase().charAt(0);
                            if(esc!='A' && esc!='B'){
                                System.out.println("Opção invalida.");
                            }
                        }while(esc!='A' && esc!='B');
                        if (esc=='A') {
                            A.addTopo(c);
                        } else{
                            B.addTopo(c);
                        }
                    } else {
                        System.out.println("Qual pilha deseja adicionar? C ou D?");
                        do {
                            esc = tc.next().toUpperCase().charAt(0);
                            if(esc!='C' && esc!='D'){
                                System.out.println("Opção invalida.");
                            }
                        }while(esc!='C' && esc!='D');
                        if (esc=='C') {
                            C.addTopo(c);
                        } else{
                            D.addTopo(c);
                        }
                    }
                }
                break;
                case 2:{
                    int opMenu;
                    System.out.println("Digite a pilha do elemento a ser removido:");
                    System.out.println("1- Perecivel 2 - Não Perecivel");
                    opMenu=tc.nextInt();
                    switch (opMenu){
                        case 1:{
                            System.out.println("1- Pilha A 2- Pilha B");

                            opMenu=tc.nextInt();

                            if(opMenu==1){
                                A=A.remove();
                            }
                            else{
                                B=B.remove();
                            }
                        }
                        break;
                        case 2:{
                            System.out.println("1- Pilha C 2- Pilha D");

                            opMenu=tc.nextInt();
                            if(opMenu==1){
                                C=C.remove();
                            }
                            else{
                                D=D.remove();
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    do{
                        System.out.println("Selecione a lista que deseja mostrar:");
                        System.out.println("1- A | 2- B | 3- C | 4- D | 5- Sair");
                        op=tc.nextInt();
                        switch (op){
                            case 1:{
                                A.mostrar();
                                break;
                            }
                            case 2:{
                                B.mostrar();
                                break;
                            }
                            case 3:{
                                C.mostrar();
                                break;
                            }
                            case 4:{
                                D.mostrar();
                                break;
                            }
                            case 5:{
                                System.out.println("Menu mostrar suspenso.");
                            }
                            default:{
                                System.out.println("Opção não disponível.");
                            }
                        }
                    }while (op!=5);
                    op=0;
                    break;
                }
                case 4:{
                    System.out.println("Pilha A:");
                    A=A.atualizarPereciveis();
                    System.out.println("Pilha B:");
                    B=B.atualizarPereciveis();
                }
                case 5:{
                    if(alertaContainers(alertaContainer)){
                        alertaContainer=System.currentTimeMillis();
                    }
                }
            }
        } while (op != 6);
    }
}

