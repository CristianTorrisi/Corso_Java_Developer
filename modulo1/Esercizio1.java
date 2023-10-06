package modulo1;

import java.util.Scanner;

public class Esercizio1 {

    /*
    Scrivere un programma Java che permetta all’utente di inserire due numeri interi e,
    successivamente, stampi a video il
    risultato di addizione, sottrazione, moltiplicazione e divisione tra i due numeri.
     */
    public static void operatoriAritmetici(){
        System.out.println("Inserisci due numeri");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("La somma e' pari a: "+(num1+num2));
        System.out.println("La differenza e' pari a: "+(num1-num2));
        System.out.println("Il prodotto e' pari a: "+(num1*num2));

        if (num2 == 0){
            System.out.println("Inserisci un secondo numero diverso ad 0");
            return;
        }


        double divisione = (double)num1/ (double) num2;
        System.out.println("Il risultato della divisione e' pari a: "+divisione);


    }
}
