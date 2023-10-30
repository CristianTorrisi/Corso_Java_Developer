package modulo4.contatore;


public class Contatore {

    private int count;

    public Contatore(int count) {
        this.count = count;
    }
    public Contatore(){

    }
    public void increment(){
        this.count++;
    }

    public int getCount() {
        return count;
    }
    public void setToZero(){
        this.count = 0;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
