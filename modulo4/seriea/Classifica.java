package modulo4.seriea;

public class Classifica {

    private Squadra[] campionato ;

    public Classifica(Squadra[] campionato) {
        this.campionato = campionato;
    }

    public Classifica() {
        this.campionato = new Squadra[0];
    }

    public Squadra[] getCampionato() {
        return campionato;
    }

    public void setCampionato(Squadra[] campionato) {
        this.campionato = campionato;
    }


}
