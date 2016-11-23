package ShareLife;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by jrg_c on 22/11/2016.
 */
public class Orgaos {
    boolean corneas, coracao, sangue, medula;
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
            this.corneas=true;
        }
        else{
            this.corneas=false;
        }
        System.out.println("Coração 1 - Sim 2 - Não");
        do {
            op = Principal.validaInt();
            if(op!=1 && op!=2){
                System.out.println("Opção invalida.");
            }
        }while(op!=1 && op!=2);
        if(op==1){
            this.coracao=true;
        }
        else{
            this.coracao=false;
        }
        System.out.println("Sangue 1 - Sim 2 - Não");
        do {
            op = Principal.validaInt();
            if(op!=1 && op!=2){
                System.out.println("Opção invalida.");
            }
        }while(op!=1 && op!=2);
        if(op==1){
            this.sangue=true;
        }
        else{
            this.sangue=false;
        }
        System.out.println("Medula 1 - Sim 2 - Não");
        do {
            op = Principal.validaInt();
            if(op!=1 && op!=2){
                System.out.println("Opção invalida.");
            }
        }while(op!=1 && op!=2);
        if(op==1){
            this.medula=true;
        }
        else{
            this.medula=false;
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
        }while (op!=0);
    }
    public void mostrarDoador(){
        String orgaos = "Orgaos doados: ";
        if(this.corneas){
            orgaos = orgaos + "| corneas |";
        }
        if(this.coracao){
            orgaos = orgaos + "| coração |";
        }
        if(this.sangue){
            orgaos = orgaos + "| sangue |";
        }
        if(this.medula){
            orgaos = orgaos + "| medula |";
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
