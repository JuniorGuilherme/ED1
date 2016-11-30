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
        this.qtd++;
    }

    public void sortUrgencia() {
        Receptor x;
        x = this.fim;
            while(x.urgencia < x.anterior.urgencia && x.anterior != null) {
                x.anterior.proximo=x.proximo;
                x.proximo=x.anterior;
                x.anterior=x.anterior.anterior;
                if(x.anterior!=null){
                    x.anterior.proximo=x;
                }
                x.proximo.anterior=x;
        }
    }

    public void addFim(Receptor r){
        if(!isEmpty() && this.qtd>1){
            r.anterior=this.fim;
            this.fim.proximo=r;
            this.fim=r;
            qtd++;
            sortUrgencia();
        }
        else{
            primeiroReceptor(r);
        }
    }
    public void addSeg(Receptor r){
        if(this.fim.urgencia>r.urgencia){
            addInicio(r);
        }
        else {
            addFim(r);
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
        Receptor x;
        x=this.inicio;
        x.mostrar();
        while(x.proximo!=null){
            x=x.proximo;
            x.mostrar();
        }
    }
    public void transplante(ListaDoador l){

    }
}
