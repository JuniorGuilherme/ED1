package ShareLife;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by jrg_c on 22/11/2016.
 */
public class Orgaos {
    String[] vetor = new String[4];
    String transplante;
    int op;

    public void lerDoador(){
        System.out.println("Corneas 1 - Sim 2 - Não");
        do {
            op = Principal.validaInt();
            if(op!=1 && op!=2){
                System.out.println("Opção invalida.");
            }
        }while(op!=1 && op!=2);
        if(op==1){
            vetor[0]="corneas";
        }else{
            vetor[0]="";
        }
        System.out.println("Coração 1 - Sim 2 - Não");
        do {
            op = Principal.validaInt();
            if(op!=1 && op!=2){
                System.out.println("Opção invalida.");
            }
        }while(op!=1 && op!=2);
        if(op==1){
            vetor[1]="coracao";
        }else{
            vetor[1]="";
        }
        System.out.println("Sangue 1 - Sim 2 - Não");
        do {
            op = Principal.validaInt();
            if(op!=1 && op!=2){
                System.out.println("Opção invalida.");
            }
        }while(op!=1 && op!=2);
        if(op==1){
            vetor[2]="sangue";
        }else{
            vetor[2]="";
        }
        System.out.println("Medula 1 - Sim 2 - Não");
        do {
            op = Principal.validaInt();
            if(op!=1 && op!=2){
                System.out.println("Opção invalida.");
            }
        }while(op!=1 && op!=2);
        if(op==1){
            vetor[3]="medula";
        }else{
            vetor[3]="";
        }
    }
    public void lerReceptor(){
        do{
            System.out.println("Selecione o transplante desejado:");
            System.out.println("1 - Corneas | 2 - Coração | 3 - Sangue | 4 - Medula | 0 - Cancelar");
            do {
                op = Principal.validaInt();
                if(op<0 || op>4);
            }while (op<0 || op>4);
            switch (op){
                case 1:{
                    transplante = "corneas";
                    break;
                }
                case 2:{
                    transplante = "coracao";
                    break;
                }
                case 3:{
                    transplante = "sangue";
                    break;
                }
                case 4:{
                    transplante = "medula";
                    break;
                }
                case 0:{
                    System.out.println("Operação suspensa.");
                }
            }
        }while (op<0 || op>4);
    }
    public void mostrarDoador(){
        String orgaos = "Orgaos doados: ";
        if(vetor[0]!=null){
            orgaos = orgaos + vetor[0] +" ";
        }
        if(vetor[1]!=null){
            orgaos = orgaos + vetor[1] +" ";
        }
        if(vetor[2]!=null){
            orgaos = orgaos + vetor[2] +" ";
        }
        if(vetor[3]!=null){
            orgaos = orgaos + vetor[3];
        }
        if(orgaos=="Orgaos doados: "){
            orgaos=orgaos+"nenhum";
        }
        System.out.println(orgaos);
    }
    public void mostrarReceptor(){
        System.out.println("Transplante desejado: "+this.transplante);
    }
}
