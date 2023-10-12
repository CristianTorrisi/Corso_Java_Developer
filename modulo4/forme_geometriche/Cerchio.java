package modulo4.forme_geometriche;

public class Cerchio {

    private int raggio;

    public Cerchio(int raggio) {
        this.raggio = raggio;
    }

    public double circonferenza(){
        return 2*Math.PI*raggio;
    }

    public double area(){
        return 2*Math.PI*Math.pow(raggio,2);
    }
}
