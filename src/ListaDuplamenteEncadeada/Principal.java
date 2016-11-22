package ListaDuplamenteEncadeada;

import java.util.Scanner;

/**
 * Created by Junior Guilherme on 22/11/2016.
 */
public class Principal {
    public static Scanner tc = new Scanner(System.in);
    public static int validaInt(){
        String num;
        do{
            num = tc.next();
            if(!num.matches("[0-9]{1,}")){
                System.out.println("Digite apenas numeros. Tente novamente.");
            }
        }while(!num.matches("[0-9]{1,}"));
        return Integer.parseInt(num);
    }
    public static void main(String[] args) {
        int op, subOp;
        ListDE list = new ListDE();
        do{
            System.out.println("1 - Adicionar | 2 - Remover | 3 - Listar | 4 - Sair");
            do {
                op = validaInt();
                if(op>4){
                    System.out.println("Opção invalida.");
                }
            }while(op>4);
            switch(op){
                case 1:{
                    do{
                        System.out.println("1 - Inicio | 2 - Fim | 3 - Apos | 0 - Sair");
                        subOp=validaInt();
                        switch (subOp){
                            case 1:{
                                StructString str = new StructString();
                                str.ler();
                                list.addInicio(str);
                                break;
                            }
                            case 2:{
                                StructString str = new StructString();
                                str.ler();
                                list.addFim(str);
                                break;
                            }
                            case 3:{
                                StructString retorno=list.busca();
                                if(retorno!=null){
                                    StructString str= new StructString();
                                    str.ler();
                                    list.addApos(retorno, str);
                                }
                                break;
                            }
                            case 0:{
                                System.out.println("Menu suspenso.");
                                break;
                            }
                            default:{
                                System.out.println("Opção invalida.");
                            }
                        }
                    }while(subOp!=0);
                    break;
                }
                case 2:{
                    do{
                        System.out.println("1 - Inicio | 2 - Fim | 3 - String Especifica | 0 - Sair");
                        subOp=validaInt();
                        switch (subOp){
                            case 1:{
                                list.removerInicio();
                                break;
                            }
                            case 2:{
                                list.removerFinal();
                                break;
                            }
                            case 3:{
                                StructString retorno = list.busca();
                                if(retorno!=null){
                                    list.remover(retorno);
                                }
                                break;
                            }
                            case 0:{
                                System.out.println("Menu suspenso.");
                                break;
                            }
                            default:{
                                System.out.println("Opção invalida.");
                            }
                        }
                    }while(subOp!=0);
                    break;
                }
                case 3:{
                    list.mostrar();
                    break;
                }
                case 4:{
                    System.out.println("Programa encerrado.");
                    break;
                }
            }
        }while(op!=4);
    }
}