package modulo2.scheda1;

public class Esercizio2 {
    /*
    Scrivete un programma che data una parola stampa a schermo il numero di vocali e
    consonanti presenti.
    Modificate il programma in modo che funzioni con una frase data. (usate le funzioni).
     */
    public static void nVocaliConsonanti(String s){
        int n_vocali = 0;
        int n_consonanti = 0;

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u') ){
                n_vocali++;
            }
            else n_consonanti++;
        }

        System.out.println("Il numero di vocali: "+n_vocali);
        System.out.println("Il numero di consonanti: "+n_consonanti);
    }
}
