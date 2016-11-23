package ShareLife;

/**
 * Created by jrg_c on 22/11/2016.
 */
public class ListaReceptor {
    Receptor inicio, fim;
    int qtd;

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
    public void mostrar(){
        Receptor x;
        x=this.inicio;
        x.mostrar();
        while(x.proximo!=null){
            x=x.proximo;
            x.mostrar();
        }
    }
}
