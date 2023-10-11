package modulo2.scheda1;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio8 {
    /*
    Dato un array di interi (inseriti dall’utente, separati da virgola e senza spazi),
    effettuare la conversione dei valori in interi e stampare in ordine minimo e massimo
    (separati da virgola).
    Gli interi inseriti possono anche assumere valori negativi.
     */

    public static void minMax(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci i valori separati da virgola senza spazi");
        String input = scanner.nextLine();
        String[] interi_stringa = input.split(",");
        int max = Integer.parseInt(interi_stringa[0]);
        int min = Integer.parseInt(interi_stringa[0]);

        for (int i = 1; i < interi_stringa.length; i++) {
            int number = Integer.parseInt(interi_stringa[i]);
            if (number > max){
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        System.out.println("Il valore minimo: "+min+" e masimo "+max+" dell array "+ input);


    }
}
