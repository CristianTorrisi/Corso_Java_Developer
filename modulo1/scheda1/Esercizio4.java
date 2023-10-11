package modulo1.scheda1;

public class Esercizio4 {

    /*
    Date tre stringhe a, b e c in input, stampare c dopo aver rimpiazzato, all’interno di c,
    ogni occorrenza compresa tra due spazi di a con b. Ad esempio,
    date in input le stringhe «a», «b», «a abc d», stampare
    a video «a bbc d». Potete dare per assunto che la stringa c conterrà sempre e solo due spazi.
     */

    public static void rimpiazza(String a,String b,String c){
        String[] splitted = c.split(" ");
        String parola_centrale = splitted[1].replace(a,b);
        System.out.println("La stringa di partenza: "+c);
        System.out.println("La stringa modificata con il replace: "+splitted[0]+" "+parola_centrale
        +" "+splitted[2]);
    }
}
