package modulo1;

public class Esercizio3 {

    /*
    Data una stringa, stampare la stessa stringa invertendone il contenuto a partire dal primo spazio,
     ad esempio data la stringa «come stai»
    stampare a video «stai come». Potete dare per assunto che la stringa conterrà sempre un solo spazio.
     */

    public static void invertiStringa(String s){
        int indeofSpace = s.indexOf(" ");
        String sub1 = s.substring(0,indeofSpace);
        String sub2 = s.substring(indeofSpace+1,s.length());

        System.out.println("Parola inserita: "+s);
        System.out.println("Parola invertita: "+sub2+" "+sub1);
    }

    public static void invertiStringa2(String s){
        String[] splitted = s.split(" ");
        System.out.println("Parola inserita: "+s);
        System.out.println("Parola invertita: "+splitted[1]+" "+splitted[0]);

    }

}
