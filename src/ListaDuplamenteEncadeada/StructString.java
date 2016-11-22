package ListaDuplamenteEncadeada;

import java.util.Scanner;

/**
 * Created by Junior Guilherme on 22/11/2016.
 */
public class StructString {
    String str;
    StructString anterior, proxima;

    public void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a String: ");
        str=tc.next();
    }
    public void mostrar(){
        System.out.println("Item:"+this.str);
    }
}