package ShareLife;

/**
 * Created by jrg_c on 22/11/2016.
 */
public class ListaDoador {
    Doador inicio, fim;
    int qtd;

    public boolean isEmpty(){
        if(this.inicio==null){
            return true;
        }
        else{
            return false;
        }
    }

    public void primeiroDoador(Doador d){
        this.inicio=d;
        this.fim=d;
    }
    public void addFim(Doador d){
        if(!isEmpty()){
            d.anterior=this.fim;
            this.fim.proximo=d;
            this.fim=d;
            qtd++;
        }
        else{
            primeiroDoador(d);
        }
    }
    public void mostrar(){
        Doador x;
        x=this.inicio;
        x.mostrar();
        while(x.proximo!=null){
            x=x.proximo;
            x.mostrar();
        }
    }
}
