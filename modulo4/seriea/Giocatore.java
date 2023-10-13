package modulo4.seriea;

public class Giocatore {

    private int id;
    private String nome;
    private String cognome;
    private static int idTot = 0;

    public Giocatore(int id, String nome, String cognome) {
        this.id = idTot;
        idTot++;
        this.nome = nome;
        this.cognome = cognome;
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String toString(){
        return nome + " " + cognome;
    }
}
