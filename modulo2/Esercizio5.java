package modulo2;

public class Esercizio5 {

    /*
    Scrivete una funzione che dato in input due numeri n ed m, crea un array lungo m che in ogni cella
    ha il valore  di indice della cella moltiplicato per n
     */
    public static int[] tabellina(int n,int m){
        int[] tab = new int[m];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i*n;
        }
        return tab;
    }
}
