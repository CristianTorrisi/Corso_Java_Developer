package modulo4.seriea;

public class Squadra implements Comparable<Squadra>{

    private int id;
    private String nome;
    private Giocatore[] rosa;
    private int gol_fatti;
    private int gol_subiti;
    private int punteggio;
    private static int idTot = 0;

    public Squadra(String nome, Giocatore[] rosa, int gol_fatti, int gol_subiti, int punteggio) {
        this.id = idTot;
        idTot++;
        this.nome = nome;
        this.rosa = rosa;
        this.gol_fatti = gol_fatti;
        this.gol_subiti = gol_subiti;
        this.punteggio = punteggio;
    }

    public Squadra(String nome) {
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

    /**
     * Aggiungi un giocatore ad una squadra
     *
     * @param g giocatore da aggiungere
     */
    public void addPlayer(Giocatore g) {
        Giocatore[] tmp = new Giocatore[rosa.length + 1];

        for (int i = 0; i < rosa.length; i++) {
            tmp[i] = rosa[i];
        }
        tmp[rosa.length] = g;
        rosa = tmp;
    }

    /**
     * Rimuovi un giocatore ad una squadra
     *
     * @param g giocatore da eliminare
     */
    public void removePlayer(Giocatore g) {
        Giocatore[] tmp = new Giocatore[rosa.length - 1];

        int index = -1;
        for (int i = 0; i < rosa.length; i++) {
            if (rosa[i] == g) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Giocatore non trovato");
        } else {
            for (int j = 0; j < index; j++) {
                tmp[j] = rosa[j];
            }
            for (int j = index; j < tmp.length; j++) {
                tmp[j] = rosa[j + 1];
            }
            rosa = tmp;
        }
    }


    /**
     * Funziona che stampa una squadra
     */
    public void printRosa() {
        String s = nome.toUpperCase() + "\n";
        for (Giocatore g : rosa) {
            s += g.toString();
        }
        System.out.println(s);
    }

    public void vittoria(int gol_fatti, int gol_subiti) {
        this.punteggio += 3;
        this.gol_fatti += gol_fatti;
        this.gol_subiti += gol_subiti;
    }

    public void pareggio(int gol){
        this.punteggio+=1;
        this.gol_fatti += gol;
        this.gol_subiti += gol;
    }

    public void sconfitta(int gol_fatti,int gol_subiti){
        this.gol_fatti += gol_fatti;
        this.gol_subiti +=gol_subiti;
    }

    @Override
    public int compareTo(Squadra o) {
        if (this.punteggio == o.punteggio){
            return -((this.gol_fatti-this.gol_subiti) - (o.gol_fatti - o.gol_subiti));
        }
      return   -(this.punteggio - o.punteggio);
    }

    @Override
    public String toString() {
        return "Squadra{" +
                "nome='" + nome + '\'' +
                ", gol_fatti=" + gol_fatti +
                ", gol_subiti=" + gol_subiti +
                ", punteggio=" + punteggio +
                '}';
    }
}
