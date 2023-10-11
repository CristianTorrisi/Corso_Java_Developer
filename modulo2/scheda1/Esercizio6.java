package modulo2.scheda1;

public class Esercizio6 {
    /*
    Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci, nella
    quale ogni numero è definito dalla somma dei due precedenti, eccetto i primi
     due che sono per definizione 0 e 1.
    Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E così via.
    Assumete di iniziare da 0,  dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e così via.
     */

    public static void fibonacci(int n){
        //di base fib(n) = fib(n-1) + fib(n-2)
        int[] arr = new int[n+1];
        //fibonacci(0) = 0
        arr[0] = 0;
        // fibonacci(1) = 1
        arr[1] = 1;

        for (int i = 2; i <=n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("Il numero di fibonacci "+n+" della sequenza vale: "+arr[n]);

    }

}
