package ListaEncadeada;

import java.util.Scanner;

/**
 * Created by jrg_c on 18/10/2016.
 */
public class Lista {
    Elemento inicio;
    int qtd;
    Elemento fim; //O fim é opcional.
    Scanner tc = new Scanner(System.in);

    public boolean primeiroElemento(Elemento e){
        this.inicio=e;
        this.fim=e;
        this.qtd++;
        return true;
    }
    public boolean addInicio(Elemento e){
        if(this.inicio == null){
            primeiroElemento(e);
            return true;
        }
        else {
            e.proximo=this.inicio;
            this.qtd++;
            this.inicio=e;
            return true;
        }
    }
    public boolean addFim(Elemento e){
        if(this.inicio==null){
            primeiroElemento(e);
            return true;
        }
        else {
            this.fim.proximo=e;
            this.qtd++;
            this.fim=e;
            return true;
        }
    }
    public void listar(){
        Elemento x;
        x=this.inicio;
        while(x!=null){
            System.out.println("Elemento: "+x.valor);
            x=x.proximo;
        }
    }
    public Elemento pesquisa(int p){
        Elemento x;
        x=this.inicio;
        while(x!=null){
            if(x.valor==p){
                return x;
            }
            else {
                x=x.proximo;
            }
        }
        return null;
    }
    public boolean addPosicao(){
        Elemento x;
        if(this.inicio!=null) {
            System.out.println("Digite o valor da posição a ser modificada: ");
            int y = tc.nextInt();
            for (x = this.inicio; x != null; x = x.proximo) {
                if (y == x.valor) {
                    System.out.println("Insira o novo valor.");
                    x.valor = tc.nextInt();
                    return true;
                }
            }
        }
        else {
            System.out.println("Ainda não existem elementos na lista.");
            return false;
        }
        System.out.println("Valor não encontrado.");
        return false;
    }
    public boolean delPosicao(){
        System.out.println("Digite o valor a ser deletado:");
        int x = tc.nextInt();
        Elemento e;
        for(e = this.inicio; e.proximo!=null; e=e.proximo){
            if(e.valor==x){
                while(e.proximo!=null){
                    e=e.proximo;
                    System.out.println("Delete.");
                }
                e.proximo=null;
                this.fim=e;
                return true;
            }
        }
        return false;
    }
}
