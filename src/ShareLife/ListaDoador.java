package ShareLife;

/**
 * Created by jrg_c on 22/11/2016.
 */
public class ListaDoador {
    Doador inicio, fim;
    int qtd, qtdTransp;

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
        this.qtd++;
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
    public void removerUmElemento(){
        this.inicio=null;
        this.fim=null;
        qtd--;
        System.out.println("Doador removido. Motivo: Sem mais orgaos a serem doados. Um elemento");
    }
    public void removerInicio(){
        if(!isEmpty()) {
            if (this.qtd != 1) {
                this.inicio = this.inicio.proximo;
                qtd--;
                System.out.println("Doador removido. Motivo: Sem mais orgaos a serem doados. Inicio");
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
                System.out.println("Doador removido. Motivo: Sem mais orgaos a serem doados. Final");
            }
        }
        else {
            System.out.println("Lista vazia.");
        }
    }
    public void remover(Doador local){
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
            System.out.println("Doador removido. Motivo: Sem mais orgaos a serem doados. Remover");
        }
    }
    public boolean verificaOrgao(Doador x, Receptor r){
        for (int i = 0; i < 4; i++) {
            if ((x.orgaos.vetor[i].equalsIgnoreCase(r.org.transplante)) && (x.p.tipoSang.equalsIgnoreCase(r.p.tipoSang))) {
                qtdTransp++;
                x.orgaos.vetor[i]="";
                return true;
            }
        }
        return false;
    }
    public boolean transplante(Receptor r) {
        if(!isEmpty()) {
            Doador x;
            x = this.inicio;
            if(verificaOrgao(x, r)){
                verificaDoador(x);
                return true;
            }
            while (x.proximo != null) {
                x = x.proximo;
                if(verificaOrgao(x, r)){
                    verificaDoador(x);
                    return true;
                }
            }
        }
        else{
            System.out.println("Lista de doares vazia.");
        }
        return false;
    }
    public boolean verificaDoador(Doador x){

        for(int i=0; i<4; i++){
            if(x.orgaos.vetor[i]!=""){
                return false;
            }
        }
        remover(x);
        return true;
    }

    public void mostrar(){
        if(!isEmpty()) {
            Doador x;
            x = this.inicio;
            x.mostrar();
            while (x.proximo != null) {
                x = x.proximo;
                x.mostrar();
            }
        }
        else{
            System.out.println("Lista de doadores vazia.");
        }
    }
}
