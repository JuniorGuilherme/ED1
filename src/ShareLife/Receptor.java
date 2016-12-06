package ShareLife;

import java.util.Scanner;

/**
 * Created by jrg_c on 22/11/2016.
 */
public class Receptor {
    Pessoa p;
    Orgaos org;
    Receptor anterior, proximo;
    int urgencia;

    public void ler(Scanner tc){
        do {
            System.out.println("Digite a urgencia:");
            urgencia=tc.nextInt();
            if(urgencia<1 || urgencia>5){
                System.out.println("Grau de urgencia entre 1 e 5. Tente novamente.");
            }
        }while(urgencia<1 || urgencia>5);
        p = new Pessoa();
        org = new Orgaos();
        p.ler();
        org.lerReceptor();
    }
    public void mostrar(){
        p.mostrar();
        System.out.println("Urgencia:"+this.urgencia);
        org.mostrarReceptor();
    }
}
