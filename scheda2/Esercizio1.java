package scheda2;

public class Esercizio1 {

    /*
    Scrivere un metodo che, dato un char a e una stringa b,
    stampa il numero di occorrenze di a in b.
     */

    public static void occorrenze(char a,String b){
      b = b.toLowerCase();
      a = String.valueOf(a).toLowerCase().charAt(0);
      int n_occorrenze = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == a){
                n_occorrenze++;
            }
        }
        System.out.println("Il numero di occorrenze di "+a+" sono "+n_occorrenze);
    }
}
