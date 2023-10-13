package modulo4.seriea;

public class Squadra {

    private int id;
    private String nome;
    private Giocatore[] rosa;
    private int gol_fatti;
    private int gol_subiti;
    private int punteggio;
    private static int idTot = 0;

    public Squadra(int id, String nome, Giocatore[] rosa, int gol_fatti, int gol_subiti, int punteggio) {
        this.id = idTot;
        idTot++;
        this.nome = nome;
        this.rosa = new Giocatore[0];
        this.gol_fatti = gol_fatti;
        this.gol_subiti = gol_subiti;
        this.punteggio = punteggio;
    }

    public Squadra(String nome){
        this.id = idTot;
        this.nome = nome;
        this.rosa = new Giocatore[0];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Giocatore[] getRosa() {
        return rosa;
    }

    public void setRosa(Giocatore[] rosa) {
        this.rosa = rosa;
    }

    public int getGol_fatti() {
        return gol_fatti;
    }

    public void setGol_fatti(int gol_fatti) {
        this.gol_fatti = gol_fatti;
    }

    public int getGol_subiti() {
        return gol_subiti;
    }

    public void setGol_subiti(int gol_subiti) {
        this.gol_subiti = gol_subiti;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }
}
