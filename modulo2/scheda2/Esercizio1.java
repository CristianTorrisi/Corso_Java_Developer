package modulo2.scheda2;

public class Esercizio1 {
    /*
    Un numero primo è un numero che è divisibile solo per se stesso e 1.
    Scrivete un programma che dato un numero N, scopre tutti i numeri primi fino a N.
     Provate a ottimizzare il programma per renderlo il più veloce possibile,
     ci sono diversi trick che potete fare per velocizzarlo!
     */

    public static void printPrime(int n){
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }


    public static boolean isPrime(int n){
        return isPrime(n,n-1);
    }

    public static boolean isPrime(int n, int div){
        if (n < 2) throw new ArithmeticException();
        if (n == 2) return true;
        if (div == 1) return true;
        if(n % div == 0) return false;

        return isPrime(n,div -1);
    }
}
