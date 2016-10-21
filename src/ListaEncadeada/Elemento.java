package ListaEncadeada;

import java.util.Scanner;

/**
 * Created by jrg_c on 18/10/2016.
 */
public class Elemento {
    int valor;
    Elemento proximo;
    public void ler(){
        System.out.println("Digite um elemento:");
        Scanner tc = new Scanner(System.in);
        valor=tc.nextInt();
    }
    public void mostrar(){
        System.out.println("Valor: "+valor);
    }
}
