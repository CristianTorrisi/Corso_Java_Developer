package scheda2;

public class Esercizio4 {

    /*
    Scrivere un programma che, dato un intero n in input,
    ne calcoli il fattoriale, ossia:

    fact(0) = 1
    fact(1) = 1
    fact(n) = n*fact(n-1)

    Ad esempio 5! = fact(4)*5 = 120
     */

    public static int fattoriale(int n){
        if ( n == 0) return 1;
        int result = 1;
        for (int i = 2; i <=n; i++) {
            result *=i;
        }
        return result;
    }

    public static int fattoriale2(int n){
        if (n<=1) return 1;
       else return n*fattoriale2(n-1);
    }
}
