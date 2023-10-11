package modulo1.scheda1;

public class Esercizio2 {

    /*
    Dato un numero, stampare true se il numero è pari, false altrimenti.
     */

    public static void isPari(int n){
        if (n % 2 == 0){
            System.out.println("Il numero "+n+" e' pari");
        }
        else System.out.println("Il numero "+n+" e' dispari");
    }
}
