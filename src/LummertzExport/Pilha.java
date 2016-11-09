package LummertzExport;



/**
 * Created by Junior Guilherme on 08/11/2016.
 */
public class Pilha {
    Conteiner[] p = new Conteiner[5];
    int topo;

    public void addTopo(Conteiner c){
        if(!isFull()) {
            this.topo++;
            this.p[this.topo] = c;
            System.out.println("Container adicionado.");
        }
        else{
            System.out.println("Pilha cheia.");
        }
    }

    public void isInit(){
        this.topo=-1;
        System.out.println("Pilha inicializada.");
    }

    public boolean pop(){
        if(this.topo==-1){
            return false;
        }
        else{
            this.topo--;
            return true;
        }
    }

    public boolean isFull(){
        if(this.topo==5){
            return true;
        }
        else{
            return false;
        }
    }

    public void exibir(){
        for(int i=0; i<=this.topo;i++){
            System.out.println("Codigo "+i+": "+this.p[i].codigo);
            System.out.println("Perecivel "+i+": "+this.p[i].tipo);
            System.out.println("País "+i+": "+this.p[i].pais);
        }
    }

}
