package modulo1.scheda2;

public class Esercizio6 {
    /*
    Scrivere un programma che, data in input una stringa s,
    restituisca true se s è palindroma, false altrimenti
     */
    public static boolean isPalindroma(String s){
        s = s.toLowerCase().replaceAll("[^a-zA-Z]", "");

        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }

}
