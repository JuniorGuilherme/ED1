package Ordenacao;

/**
 * Created by Junior Guilherme on 16/10/2016.
 */
public class MetodosSorts {
    public long selectSort(int[] x){
        long start = System.currentTimeMillis();
        int aux;
        for (int f = 0; f < x.length; f++)
        {
            aux = x[f];
            for (int g = f; g < x.length; g++)
            {
                if (x[g] < aux)
                {
                    aux = x[g];
                    x[g] = x[f];
                    x[f] = aux;
                }
            }
        }
        return System.currentTimeMillis() - start;
    }

    public long insertSort(int[] x){
        long start = System.currentTimeMillis();
        int aux;
        for(int i=1; i<x.length; i++){
            for(int f=0; f<i; f++){
                if(x[i]<x[f]){
                    aux=x[f];
                    x[f]=x[i];
                    x[i]=aux;
                }
            }
        }
        return System.currentTimeMillis() - start;
    }
    public long bubleSort(int[] x){
        long start = System.currentTimeMillis();
        int aux;
        boolean ord;
            for (int j = 1; j < x.length; j++) {
                ord = true;
                for (int i = 1; i < x.length; i++) {
                    if (x[i - 1] > x[i]) {
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
        return System.currentTimeMillis() - start;
    }
}
