package modulo4.lampadina;

public class Impianto {

    private static boolean elettricity;
    Lampadina[] lampadinas ;

    public Impianto(boolean elettricity, Lampadina[] lampadinas) {
        this.elettricity = elettricity;
        this.lampadinas = lampadinas;
    }

    public static boolean isElettricity() {
        return elettricity;
    }

    public void setElettricity(boolean elettricity){
        if (elettricity == false){
            for (Lampadina lampadina:lampadinas) {
                if(lampadina.getStato()==1){
                    lampadina.setStato(0);
                }
            }
        }
        this.elettricity = elettricity;
    }
}
