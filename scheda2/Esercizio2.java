package scheda2;

public class Esercizio2 {

    /*
    Scrivere un metodo che, data una stringa s in input, ne stampi il reverse,
    ossia la stringa al contrario. Esempio: data la stringa «ciao»,
    dovrà stampare «oaic».
     */

    public static void invertiStringa(String s){
        String inverted = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            inverted += s.charAt(i);
        }
        System.out.println("Stringa originale: "+s);
        System.out.println("Stringa inverita: "+inverted);
    }
}
