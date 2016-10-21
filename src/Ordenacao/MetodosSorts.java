package Ordenacao;

/**
 * Created by Junior Guilherme on 16/10/2016.
 */
public class MetodosSorts {
    public long selectSort(int[] x){
        long start = System.currentTimeMillis();
        int aux;
        long contComp=0, contTroca=0;
        for (int f = 0; f < x.length; f++)
        {
            aux = x[f];
            for (int g = f; g < x.length; g++)
            {
                contComp++;
                if (x[g] < aux)
                {
                    contTroca++;
                    aux = x[g];
                    x[g] = x[f];
                    x[f] = aux;
                }
            }
        }
        System.out.println("Select Sort");
        System.out.println("Numero comparações: "+contComp);
        System.out.println("Numero trocas: "+contTroca);
        return System.currentTimeMillis() - start;
    }

    public long insertSort(int[] x){
        long start = System.currentTimeMillis();
        int aux;
        long contComp=0, contTroca=0;
        for(int i=1; i<x.length; i++){
            for(int f=0; f<i; f++){
                contComp++;
                if(x[i]<x[f]){
                    contTroca++;
                    aux=x[f];
                    x[f]=x[i];
                    x[i]=aux;
                }
            }
        }
        System.out.println("Insert Sort");
        System.out.println("Numero comparações: "+contComp);
        System.out.println("Numero trocas: "+contTroca);
        return System.currentTimeMillis() - start;
    }
    public long bubleSort(int[] x){
        long start = System.currentTimeMillis();
        int aux;
        long contComp=0, contTroca=0;
        boolean ord;
            for (int j = 1; j < x.length; j++) {
                ord = true;
                for (int i = 1; i < x.length; i++) {
                    contComp++;
                    if (x[i - 1] > x[i]) {
                        contTroca++;
                        aux = x[i - 1];
                        x[i - 1] = x[i];
                        x[i] = aux;
                        ord = false;
                    }
                }
                if(ord){
                    break;
                }
            }
        System.out.println("Buble Sort");
        System.out.println("Numero comparações: "+contComp);
        System.out.println("Numero trocas: "+contTroca);
        return System.currentTimeMillis() - start;
    }
}
