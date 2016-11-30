package ShareLife;

import LummertzExport.List;

import java.util.Scanner;

/**
 * Created by jrg_c on 22/11/2016.
 */
public class Principal {
    public static Scanner tc = new Scanner(System.in);
    public static int validaInt(){
        String num;
        do{
            num=tc.next();
            if(!num.matches("[0-9]{1,}")){
                System.out.println("Digite apenas numeros.");
            }
        }while(!num.matches("[0-9]{1,}"));
        return Integer.parseInt(num);
    }
    public static void main(String[] args) {
        int op, opSub;
        ListaDoador doadores = new ListaDoador();
        ListaReceptor receptores = new ListaReceptor();
        do{
            System.out.println("1 - Cadastrar Doador");
            System.out.println("2 - Cadastrar Receptor");
            System.out.println("3 - Realizar Transplante");
            System.out.println("4 - Total de Transplantes");
            System.out.println("5 - Tamanho da Fila de Espera");
            System.out.println("6 - Mostrar Listas de Espera");
            System.out.println("7 - Sair");
            do {
                op = validaInt();
                if(op>7 || op<1){
                    System.out.println("Opção invalida.");
                }
            }while (op>7 || op<1);
            switch (op){
                case 1:{
                    Doador d = new Doador();
                    d.ler();
                    doadores.addFim(d);
                    break;
                }
                case 2:{
                    Receptor r = new Receptor();
                    r.ler(tc);
                    receptores.addFim(r);
                    break;
                }
                case 3:{

                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    do{
                        System.out.println("1- Doadores | 2 - Receptores | 0 - Sair");
                        opSub = validaInt();
                        switch (opSub){
                            case 1:{
                                doadores.mostrar();
                                break;
                            }
                            case 2:{
                                receptores.mostrar();
                            }
                        }
                    }while(opSub!=0);
                    break;
                }
                case 7:{
                    System.out.println("Programa encerrado.");
                    break;
                }

            }
        }while(op!=7);
    }
}
