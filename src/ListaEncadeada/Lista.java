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
            Elemento x = this.inicio;
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
        if(this.inicio!=null) {
            Elemento x;
            x = this.inicio;
            while (x != null) {
                System.out.println("Elemento: " + x.valor);
                x = x.proximo;
            }
        }
        else{
            System.out.println("Lista ainda vazia.");
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
    public boolean addPosicao(Elemento e){
        Elemento x = this.inicio;
        if(this.inicio!=null) {

            System.out.println("Digite a posição:");
            int y = tc.nextInt();
            if(y>this.qtd){
                addFim(e);
            }
            else {
                for (int i = 1; i < y - 1; i++) {
                    x = x.proximo;
                }
                e.proximo = x.proximo;
                x.proximo = e;
                qtd++;
            }
            return true;
        }
        else{
            primeiroElemento(e);
            return true;
        }
    }
    public boolean delPosicao(){
        int x;
        if(this.inicio!=null && qtd>1) {
            System.out.println("Digite a posição:");
            do {
                x = tc.nextInt();
                if(x>this.qtd || x<1){
                    System.out.println("Posição inexistente.");
                }
            }while(x>this.qtd || x<1);
            Elemento e = this.inicio;
            for (int i = 1; i < x - 1; i++) {
                e = e.proximo;
            }
            e.mostrar();
            e.proximo = e.proximo.proximo;
            this.qtd--;
            return true;
        }
        if(this.qtd==1){
            delInicio();
        }
        return true;
    }
    public boolean delInicio(){
        if(this.inicio==null ) {
            System.out.println("A lista esta vazia.");
        }
        else if(this.qtd==1){
            this.inicio=null;
            this.qtd--;
        }
        else {
            Elemento e;
            e=this.inicio.proximo;
            this.inicio=e;
            e=null;
            qtd--;
        }
        return true;
    }
    public boolean delFim(){
        Elemento x=this.inicio;
        System.out.println("Fim: "+this.fim.valor);
        this.fim=null;
        for(int i=1; i<qtd-1; i++){
            x=x.proximo;
        }
        System.out.println("Elemento: "+x.valor);
        x.proximo=null;
        this.fim=x;
        this.qtd--;
        return true;
    }
}
