package LummertzExport;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Junior Guilherme on 08/11/2016.
 */
public class Conteiner {
    String codigo, pais;
    char tipo;
    Long timeInit, atualTime;
    Conteiner proximo;

    public void ler(){
            int flag;
            Scanner tc = new Scanner(System.in);
            System.out.println("Digite o codigo:");
            Pattern patern = Pattern.compile("[a-zA-Z]{2,2}-\\d{4,4}");
            do {
                flag=0;
                codigo = tc.next();
                Matcher matcher = patern.matcher(codigo);
                if(!matcher.find()){
                    System.out.println("Codigo incorreto. Digite neste formato: XX-0000");
                    flag=1;
                }
            }while(flag!=0);

            System.out.println("Digite o pais:");
            pais = tc.next();
            System.out.println("Perecivel? S (Sim) ou N (Não): ");
            do {
                tipo = tc.next().toUpperCase().charAt(0);
                if(tipo!='S' && tipo!='N'){
                    System.out.println("Digite apenas S ou N");
                }
            }while(tipo!='S' && tipo!='N');
            timeInit = System.currentTimeMillis();
    }

    public boolean isPerecivel(Conteiner c){
        if(c.tipo=='S'){
            return true;
        }
        else{
            return false;
        }
    }
    public void mostrar(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Perecivel: " + this.tipo);
        System.out.println("País: " + this.pais);
        this.atualTime = (System.currentTimeMillis() - this.timeInit)/1000;
        System.out.println("Tempo Empilhado: " + atualTime+"s");
    }
}
