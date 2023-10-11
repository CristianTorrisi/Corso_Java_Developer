package modulo2.scheda2;

public class Esercizio5 {
    /*
    Un numero perfetto è un numero che è uguale alla somma dei suoi divisori escluso se stesso.
    Per esempio, il 6 è un numero perfetto perché i suoi divisori escluso se stesso sono
    3,2 e 1 e sommandoli otteniamo di nuovo il 6
     Scrivete un programma che scopre i numeri perfetti fino al 1000.
     */

    public static void printPerfet(int n){
        for (int i = 0; i <= n; i++) {
            if (isPerferct(i)) System.out.println(i);
        }
    }

    public static boolean isPerferct(int n){
        if (n<=1) return false;
        int divisorSum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                divisorSum +=i;
        }
        return divisorSum == n;
    }
}
