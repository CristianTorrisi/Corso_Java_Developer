package modulo2.scheda2;

import java.util.Arrays;

public class Esercizio2 {
    /*
    Dato un array di int stamparne la somma tramite ricorsione
     */

    public static int sommaRicoriva(int[] vect){
        int count = 0;
        for (int i = 0; i < vect.length; i++) {
            count += vect[i];
        }
        return count;
    }

    public static int sommaArr(int[] arr){
        if (arr.length == 1) return arr[0];
        return arr[arr.length-1] + sommaRicoriva(Arrays.copyOf(arr,arr.length-1));
    }
}
