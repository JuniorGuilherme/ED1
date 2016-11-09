package LummertzExport;

import java.util.Scanner;

/**
 * Created by Junior Guilherme on 08/11/2016.
 */
public class List {
    Conteiner topo, base;
    int qtd;
    Scanner tc = new Scanner(System.in);

    public boolean primeiraPilha(Conteiner c) {
        this.base = c;
        this.topo = c;
        this.qtd++;
        return true;
    }

    public void addTopo(Conteiner c) {
        if (this.base == null) {
            primeiraPilha(c);
        } else if (!isFull()) {
            this.topo.proximo = c;
            this.topo = c;
            this.qtd++;
        }
    }

    public boolean isFull() {
        if (this.qtd == 5) {
            System.out.println("Pilha cheia.");
            return true;

        } else {
            return false;
        }
    }

    public void mostrar() {
        if(this.base!=null) {
            Conteiner x;
            x = this.base;
            x.mostrar();
            while (x.proximo != null) {
                x = x.proximo;
                x.mostrar();
            }
        }
        else {
            System.out.println("Pilha ainda vazia.");
        }
    }
    public boolean isEmpty(){
        if(this.base==null){
            System.out.println("Pilha vazia.");
            return true;
        }
        else {
            return false;
        }
    }

    public List remove(){
        if(!isEmpty()) {
            Conteiner a = this.base;
            int flag=0;
            String codigo;
            System.out.println("Digite o codigo:");
            codigo = tc.next();
            List aux = new List();
            do {
                if (a.codigo.equals(codigo)) {
                    flag=1;
                    System.out.println("Container encontrado");
                    aux.addTopo(a.proximo);
                    while (a.proximo != null){
                        a=a.proximo;
                        aux.addTopo(a.proximo);
                    }
                } else {
                    aux.addTopo(a);
                    if(a.proximo!=null) {
                        a = a.proximo;
                    }
                }
            } while (a.proximo != null);
            if(flag==0){
                System.out.println("Container não encontrado.");
            }
            return aux;
        }
        else {
            return this;
        }
    }
    public List atualizarPereciveis(){
        List aux = new List();
        if(!isEmpty()) {
            Conteiner x = this.base;
            if (this.base.proximo != null) {
                while (x.proximo != null) {
                    x.atualTime = (System.currentTimeMillis() - x.timeInit) / 1000;
                    System.out.println("Conteiner Codigo: "+x.codigo);
                    if (x.atualTime >= 24) {
                        System.out.println("Status: Vencido.");
                    } else {
                        aux.addTopo(x);
                        System.out.println("Status: Não vencido.");
                    }
                    x = x.proximo;
                }
                return aux;
            } else {
                x.atualTime = (System.currentTimeMillis() - x.timeInit) / 1000;
                System.out.println("Conteiner Codigo: "+x.codigo);
                if (x.atualTime >= 24) {
                    System.out.println("Status: Vencido.");
                } else {
                    aux.addTopo(x);
                    System.out.println("Status: Não vencido.");
                }
                return aux;
            }
        }
        else {
            return aux;
        }
    }
}
