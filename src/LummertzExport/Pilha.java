package LummertzExport;



/**
 * Created by Junior Guilherme on 08/11/2016.
 */
public class Pilha {
    Conteiner inicio, fim;
    int qtd;
    Pilha proxima;
    Pilhas ps = new Pilhas();

    public boolean primeiroContainer(Conteiner c){
        this.inicio=c;
        this.fim=c;
        this.qtd++;
        return true;
    }
    public boolean addInicio(Conteiner c){
        if(this.inicio == null){
            primeiroContainer(c);
            return true;
        }
        else {
            c.proximo=this.inicio;
            this.qtd++;
            this.inicio=c;
            return true;
        }
    }
    public boolean addFim(Conteiner c){
        if(this.inicio==null){
            primeiroContainer(c);
            return true;
        }
        else {
            this.fim.proximo=c;
            this.qtd++;
            this.fim=c;
            return true;
        }
    }
}
