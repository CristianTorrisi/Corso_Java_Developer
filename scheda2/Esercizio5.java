package scheda2;

public class Esercizio5 {
    /*
    Scrivere un programma che, dato un intero n in input,
    calcoli la somma di una serie armonica fino a n, ossia:

    harm(n) = 1 + 1/2 + ... 1/(n-1) + 1/n

    formula ricorsiva:
    harm(1) = 1
    harm(n) = harm(n-1) + 1/n
     */

    public static double armonica(int n){
        double harmonic = 1.0;

        for (int i = 2; i <=n; i++) {
            harmonic += 1.0/i;
        }
        return harmonic;
    }
    public static double armonicaRecursive(int n){
        if (n == 1) return 1;
        else return 1.0/n + armonicaRecursive(n-1);
    }

}
