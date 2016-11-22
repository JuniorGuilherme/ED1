package ListaDuplamenteEncadeada;

import java.util.Scanner;

/**
 * Created by Junior Guilherme on 22/11/2016.
 */
public class ListDE {
    StructString inicio, fim;
    int qtd;

    public void primeiroItem(StructString s){
        this.inicio=s;
        this.fim=s;
        qtd++;
    }
    public void addInicio(StructString s){
        if(isEmpty()){
            primeiroItem(s);
        }
        else {
            this.inicio.anterior=s;
            s.proxima=this.inicio;
            this.inicio=s;
            qtd++;
        }
    }
    public void addFim(StructString s){
        if(isEmpty()){
            primeiroItem(s);
        }
        else {
            this.fim.proxima=s;
            s.anterior=this.fim;
            this.fim=s;
            qtd++;
        }
    }
    public StructString busca(){
        StructString retorno = new StructString();
        if(!isEmpty()) {
            String s;
            Scanner tc = new Scanner(System.in);
            System.out.println("Digite a String para Busca:");
            s = tc.next();
            StructString x;
            x = this.inicio;
            if (x.str.equalsIgnoreCase(s)) {
                System.out.println("Elemento encontrado");
                return x;
            }
            while (x.proxima != null) {
                x = x.proxima;
                if (x.str.equalsIgnoreCase(s)) {
                    System.out.println("Elemento encontrado");
                    return x;
                }
            }
            if (retorno == null) {
                System.out.println("Elemento não encontrado.");
            }
        }
        else {
            System.out.println("Lista vazia.");
        }
        return null;
    }
    public void addApos(StructString local, StructString nova) {
        nova.proxima = local.proxima;
        if (local.proxima != null) {
            local.proxima.anterior = nova;
        }
        nova.anterior = local;
        local.proxima = nova;
        System.out.println("Elemento inserido com sucesso.");
    }
    public void mostrar(){
        if(!isEmpty()) {
            StructString str = this.inicio;
            str.mostrar();
            while (str.proxima != null) {
                str = str.proxima;
                str.mostrar();
            }
        }
        else {
            System.out.println("Lista vazia.");
        }
    }
    public boolean isEmpty(){
        if(this.inicio==null){
            return true;
        }
        else {
            return false;
        }
    }
    public void removerUmElemento(){
        this.inicio=null;
        this.fim=null;
        qtd--;
        System.out.println("Item removido.");
    }
    public void removerInicio(){
        if(!isEmpty()) {
            if (this.qtd != 1) {
                this.inicio = this.inicio.proxima;
                this.inicio.anterior = null;
                qtd--;
                System.out.println("Item removido.");
            } else {
                removerUmElemento();
            }
        }
        else {
            System.out.println("Lista vazia.");
        }
    }
    public void removerFinal(){
        if(!isEmpty()) {
            if (this.qtd == 1) {
                removerUmElemento();
            } else {

                this.fim = this.fim.anterior;
                this.fim.proxima = null;
                qtd--;
                System.out.println("Item removido.");
            }
        }
        else {
            System.out.println("Lista vazia.");
        }
    }
    public void remover(StructString local){
        if(this.inicio==local){
            removerInicio();
        }
        else if(local==fim){
            removerFinal();
        }
        else{
            local.anterior.proxima=local.proxima;
            local.proxima.anterior=local.anterior;
            qtd--;
            System.out.println("Item removido.");
        }
    }
}