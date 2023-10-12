package modulo4.lampadina;

public class Lampadina {

    private int stato; // -1: rotta  0: spento 1: acceso
    private int n_click;
    private int max_click;

    public Lampadina(int max_click) {
        if (max_click<=0){
            System.out.println("Max click errato");
            this.max_click = 0;
        }
        else {
            this.max_click = max_click;
        }

    }

    public String printStato() {
        switch (stato) {
            case -1: return "ROTTA";
            case 0: return "SPENTA";
            case 1: return "ACCESA";
            default: return "ERROR";
        }
    }

    public int getStato() {
        return stato;
    }

    public void click(){
        if (Impianto.isElettricity()){
            if (n_click == max_click){
                System.out.println("Lampadina rotta");
            }
            else if (n_click == max_click - 1){
                n_click++;
                stato = -1;
            }
            else {
                n_click++;
                stato = (stato == 0 ? 1:0);
            }
        }

    }

    public void setStato(int stato) {
        this.stato = stato;
    }
}
