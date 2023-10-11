package modulo2.scheda1;

public class Esercizio4 {
    /*
    Scrivete una funzione che dato un array di valori ne restituisce
    una copia dove i numeri dispari sono stati moltiplicati per 2.
     */
    public static int[] multiDisp(int [] arr){

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) result[i] = arr[i];
            else result[i] = arr[i] * 2;
        }
        return result;
    }
}
