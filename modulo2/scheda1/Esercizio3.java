package modulo2.scheda1;

public class Esercizio3 {

    /*
    Scrivete una funzione che dato in input un numero di secondi,
    restituisce una stringa che dice «Giorni: numero di giorni, Ore: numero di ore etc…»
     */
    public static String printDHMS(int sec){

        int Giorni;
        Giorni = sec / 86400;
        sec = sec % 86400;

        int Ore;
        Ore = sec / 3600;
        sec = sec % 3600;

        int Minuti;
        Minuti = sec / 60;
        sec = sec % 60;

        return "Giorni: "+Giorni+" Ore: "+Ore+" Minuti: "+Minuti+" Secondi: "+sec;


    }
}
