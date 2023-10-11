package modulo2.scheda2;

import java.util.Arrays;

public class Esercizio6 {
    /*
    Implemento l'algoritmo di ricerca binaria per la ricerca di un elemento
    all'interno di un array di interi

     */
    public static boolean binarySearch(int[] arr,int n){
        Arrays.sort(arr);
        return binarySearch(arr,n,0,arr.length-1);
    }

    public static boolean binarySearch(int[] arr,int n,int leftIndex,int rightIndex){
        if (arr.length == 0) return false;
        if (leftIndex > rightIndex) return false;

        int midIndex = leftIndex +(rightIndex-leftIndex)/2;

        if (n == arr[midIndex]) return true;

        if (n < arr[midIndex])
            return binarySearch(arr,n,leftIndex,midIndex-1);

            return binarySearch(arr,n,midIndex+1,rightIndex);
    }
}
