package LummertzExport;

/**
 * Created by Junior Guilherme on 08/11/2016.
 */
public class Pilhas {
    Pilha inicio, fim;
    int qtd;

    public boolean primeiraPilha(Pilha p){
        this.inicio=p;
        this.fim=p;
        this.qtd++;
        return true;
    }

    public boolean addInicio(Pilha p){
        if(this.inicio==null){
            primeiraPilha(p);
            return true;
        }
        else{
            p.proxima=inicio;
            this.inicio = p;
            qtd++;
            return true;
        }
    }
}
