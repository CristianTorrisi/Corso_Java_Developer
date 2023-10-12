package modulo4.forme_geometriche;

public class Quadrato {

    private int lato;
    private Colore colore;

    public Quadrato(int lato) {
        this.lato = lato;
        this.colore = Colore.NERO;
    }

    public int perimetro(){
        return this.lato*4;
    }

    public void stampaQuadrato(){
        String stampa = "";
        for (int i = 0; i < this.lato; i++) {
            for (int j = 0; j < this.lato; j++) {
                stampa+="*";
            }
            stampa += "\n";
        }
        System.out.println(stampa);
    }

    public Colore getColore(){
        return this.colore;
    }

    public void setColore(Colore colore){
        this.colore = colore;
    }
}
