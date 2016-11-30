package ShareLife;

import java.util.Scanner;

/**
 * Created by jrg_c on 22/11/2016.
 */
public class Pessoa {
    String nome, tipoSang;
    int idade;

    public void ler(){
        Scanner tc = new Scanner(System.in);
        int opSang;
        System.out.println("Nome:");
        this.nome=tc.next();
        System.out.println("Idade:");
        this.idade=tc.nextInt();
        System.out.println("Tipo Sanguineo:");
        do{
            System.out.println("1 - (A-) | 2 - (A+) | 3 - (B-) | 4 - (B+)");
            System.out.println("5 - (AB+) | 6 - (AB-) | 7 - (O+) | 8 - (O-)");
            opSang = tc.nextInt();
            switch (opSang){
                case 1:{
                    tipoSang="A-";
                    break;
                }
                case 2:{
                    tipoSang="A+";
                    break;
                }
                case 3:{
                    tipoSang="B-";
                    break;
                }
                case 4:{
                    tipoSang="B+";
                    break;
                }
                case 5:{
                    tipoSang="AB+";
                    break;
                }
                case 6:{
                    tipoSang="AB-";
                    break;
                }
                case 7:{
                    tipoSang="O+";
                    break;
                }
                case 8:{
                    tipoSang="O-";
                    break;
                }
            }
            if(opSang<1 || opSang>8){
                System.out.println("Opção invalida");
            }
        }while(opSang<1 || opSang>8);
    }
    public void mostrar(){
        System.out.println("Nome do Doador: "+this.nome);
        System.out.println("Tipo Sanguineo: "+this.tipoSang);
        System.out.println("Idade: "+this.idade);
    }
}
