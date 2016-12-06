package ShareLife;

import java.util.Scanner;

/**
 * Created by jrg_c on 22/11/2016.
 */
public class ListaReceptor {
    Receptor inicio, fim;
    int qtd;
    Scanner tc = new Scanner(System.in);
    public boolean isEmpty(){
        if(this.inicio==null){
            return true;
        }
        else{
            return false;
        }
    }

    public void primeiroReceptor(Receptor r){
        this.inicio=r;
        this.fim=r;
        this.qtd++;
    }

    public void sortUrgencia(ListaDoador d) {
        Receptor x, transp;
        if(!isEmpty()) {
            x = this.inicio;
            transp = x;
            while (x.proximo != null) {
                if (x.urgencia < x.proximo.urgencia) {
                    transp = x.proximo;
                    x = x.proximo;
                } else {
                    x = x.proximo;
                }
            }
            if(d.transplante(transp)){
                System.out.println("Transplante realizado com sucesso para o receptor:");
                transp.mostrar();
                remover(transp);
            }
            else{
                System.out.println("Doadores incompativeis para o caso de maior urgencia.");
                int esc;
                do{
                    System.out.println("Realizar transplante ignorando a urgencia? 1 - Sim | 2 - Nao");
                    esc=tc.nextInt();
                    switch (esc){
                        case 1:{
                            if(!isEmpty()) {
                                x = this.inicio;
                                int sucesso = 0;
                                if (!d.transplante(x)) {
                                    while (sucesso !=1 && x.proximo != null){
                                        x = x.proximo;
                                        if (d.transplante(x)) {
                                            System.out.println("Transplante realizado com sucesso para o receptor: ");
                                            x.mostrar();
                                            remover(x);
                                            sucesso = 1;
                                        }
                                    }
                                    if(sucesso==0){
                                        System.out.println("Doadores incompativeis para os receptores.");
                                    }
                                } else {
                                    System.out.println("Transplante realizado com sucesso para o receptor: ");
                                    transp.mostrar();
                                    remover(x);
                                }
                            }else{
                                System.out.println("Lista de doares vazia.");
                            }
                        }
                        break;
                        case 2:{
                            System.out.println("Menu suspenso.");
                        }
                        break;
                        default:{
                            System.out.println("Opcao incorreta.");
                        }
                    }
                }while (esc!=2);
            }
        }
        else {
            System.out.println("Lista vazia.");
        }
    }

    public void addFim(Receptor r){
        if(!isEmpty()){
            r.anterior=this.fim;
            this.fim.proximo=r;
            this.fim=r;
            qtd++;
        }
        else{
            primeiroReceptor(r);
        }
    }

    public void addInicio(Receptor r){
        if(!isEmpty()){
            r.proximo=this.inicio;
            r.proximo.anterior=r;
            this.inicio=r;
            this.qtd++;
        }
        else{
            primeiroReceptor(r);
        }
    }
    public void mostrar(){
        if(!isEmpty()) {
            Receptor x;
            x = this.inicio;
            x.mostrar();
            while (x.proximo != null) {
                x = x.proximo;
                x.mostrar();
            }
        }
        else {
            System.out.println("Lista recptores vazia.");
        }
    }
    public void removerUmElemento(){
        this.inicio=null;
        this.fim=null;
        qtd--;
        System.out.println("Receptor removido.");
    }
    public void removerInicio(){
        if(!isEmpty()) {
            if (this.qtd != 1) {
                this.inicio = this.inicio.proximo;
                this.inicio = null;
                qtd--;
                System.out.println("Receptor removido.");
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
                this.fim.proximo = null;
                qtd--;
                System.out.println("Receptor removido.");
            }
        }
        else {
            System.out.println("Lista vazia.");
        }
    }
    public void remover(Receptor local){
        if(this.inicio==local){
            removerInicio();
        }
        else if(local==fim){
            removerFinal();
        }
        else{
            local.anterior.proximo=local.proximo;
            local.proximo.anterior=local.anterior;
            qtd--;
            System.out.println("Receptor removido.");
        }
    }
}
