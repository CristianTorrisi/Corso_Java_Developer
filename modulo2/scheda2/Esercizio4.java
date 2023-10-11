package modulo2.scheda2;

public class Esercizio4 {
    /*
    Stampare la riga n-esima del triangolo di Tartaglia
     */

    public static int[] tartaglia(int n){
        if (n == 1) return new int[]{1};
        if (n == 2) return new int[]{1,1};

        int[] prev_row = tartaglia(n-1);
        int[] next_row = new int[prev_row.length+1];

        next_row[0] = 1;
        next_row[next_row.length-1] = 1;

        for (int i = 0; i < prev_row.length-1; i++) {
            next_row[i+1] = prev_row[i] + prev_row[i+1];
        }

        return next_row;
    }
}
