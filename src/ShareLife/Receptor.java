package ShareLife;

import java.util.Scanner;

/**
 * Created by jrg_c on 22/11/2016.
 */
public class Receptor {
    Pessoa p;
    Orgaos org;
    Receptor anterior, proximo;

    public void ler(){
        p = new Pessoa();
        org = new Orgaos();
        p.ler();
        org.lerReceptor();
    }
    public void mostrar(){
        p.mostrar();
        org.mostrarReceptor();
    }
}
