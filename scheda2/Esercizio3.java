package scheda2;

public class Esercizio3 {
    /*
    Scrivere un metodo che, dato in input un intero a,
    ritorni true se il numero è primo, false altrimenti.
     */
    public static boolean isPrimo(int n) {
        n = Math.abs(n);
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
