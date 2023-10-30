package modulo4.seriea;

import java.util.Arrays;

public class Classifica {

    private Squadra[] campionato ;

    public Classifica(Squadra[] campionato) {
        this.campionato = campionato;
    }

    public Classifica() {
        this.campionato = new Squadra[0];
    }

    /**
     * Ritorana la classifica in base al punteggio(e differenza reti)
     * @return classifica
     */
    public Squadra[] getClassifica() {
        Arrays.sort(campionato);
        return campionato;
    }

    public Squadra[] getCampionato() {
        return campionato;
    }

    public void setCampionato(Squadra[] campionato) {
        this.campionato = campionato;
    }

    public void addTeam(Squadra t) {
        Squadra[] tmp = new Squadra[campionato.length+1];
        for (int i = 0; i < campionato.length; i++) {
            tmp[i] = campionato[i];
        }
        tmp[campionato.length] = t;
        campionato = tmp;
        tmp = new Squadra[0];
    }

    public void removeTeam(Squadra t) {
        Squadra[] tmp = new Squadra[campionato.length-1];
        int index = -1;
        for (int i = 0; i < campionato.length; i++) {
            if (campionato[i] == t) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("ERRORE! Team non trovato");
        }
        else {
            for (int i = 0; i < index; i++) {
                tmp[i] = campionato[i];
            }
            for (int i = index; i < tmp.length; i++) {
                tmp[i] = campionato[i+1];
            }
            campionato = tmp;
            tmp = new Squadra[0];
        }
    }

    public boolean isPresent(Squadra t){
        for (Squadra squadra : campionato) {
            if (squadra == t)
                return true;
        }
        return false;
    }

    public void esitoPartita(Squadra in_casa, Squadra in_trasferta,int golCasa,int golTrasferta){
        if (!isPresent(in_casa) || !isPresent(in_trasferta)){
            System.out.println("ERRORE! Una delle squadre (o entrambe!) non partecipano al campionato");
            return;
        }
        if (golCasa > golTrasferta){
            in_casa.vittoria(golCasa,golTrasferta);
            in_trasferta.sconfitta(golTrasferta,golCasa);
        }

        if (golCasa == golTrasferta){
            in_casa.pareggio(golCasa);
            in_trasferta.pareggio(golTrasferta);
        }

        if (golCasa < golTrasferta){
            in_casa.sconfitta(golCasa,golTrasferta);
            in_trasferta.vittoria(golTrasferta,golCasa);
        }
    }

    public Squadra miglioreAttacco() {
        if (campionato.length == 0) {
            System.out.println("Errore! Campionato vuoto");
            return null;
        }
        Squadra max_t = campionato[0];
        for (int i = 1; i < campionato.length; i++) {
            if (campionato[i].getGol_fatti() > max_t.getGol_fatti()) {
                max_t = campionato[i];
            }
        }
        return max_t;
    }

    public Squadra peggiorDifesa() {
        if (campionato.length == 0) {
            System.out.println("Errore! Campionato vuoto");
            return null;
        }
        Squadra max_t = campionato[0];
        for (int i = 1; i < campionato.length; i++) {
            if (campionato[i].getGol_fatti() > max_t.getGol_subiti()) {
                max_t = campionato[i];
            }
        }
        return max_t;
    }

    @Override
    public String toString() {
        String s = "Team, punti, gol_fatti, gol_subiti" + "\n";
        for (Squadra t : campionato) {
            s += t.toString() + "\n";
        }
        return s;
    }
}
