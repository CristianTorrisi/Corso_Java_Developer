package modulo2.scheda2;

public class Esercizio3 {
    /*
    Data una stringa dire se sia palindroma mediante ricorsione
     */

    public static boolean isPalindroma(String s){
        if (s.length() == 0) return true;
        if (s.length() == 1) return true;

        if(s.charAt(0) != s.charAt(s.length()-1)) return false;

        return isPalindroma(s.substring(1,s.length()-1));

    }
}
