package modulo1;

public class Esercizio5 {

     /*
    Date tre stringhe a, b e c in input, stampare l’intero corrispondente al numero di
    stringhe uguali tra loro (ignorando maiuscole e minuscole). Esempio: se a, b e c
    sono uguali tra loro stamperà «3», se invece a e b sono uguali ma c è diversa stamperà 2 etc.
     */
    public static void stringheUguali(String a,String b,String c){

        if (a.equalsIgnoreCase(b) && a.equalsIgnoreCase(c)){
            // se a=b e a=c => b=c quindi tutte e 3 sono uguali
            System.out.println("Stringhe uguali sono 3");
        }
       else if (a.equalsIgnoreCase(b) || b.equalsIgnoreCase(c) || a.equalsIgnoreCase(c)){
            System.out.println("Stringhe uguali sono 2");
        }
        else System.out.println("Nessuna stringua uguale");
    }
}
