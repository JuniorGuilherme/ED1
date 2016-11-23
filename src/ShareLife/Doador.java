package ShareLife;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by jrg_c on 22/11/2016.
 */
public class Doador {
    Pessoa p;
    Orgaos orgaos;
    Doador proximo, anterior;


    public void ler(){
        p = new Pessoa();
        p.ler();
        orgaos = new Orgaos();
        orgaos.lerDoador();
    }
    public void mostrar(){
        p.mostrar();
        orgaos.mostrarDoador();
    }
}
