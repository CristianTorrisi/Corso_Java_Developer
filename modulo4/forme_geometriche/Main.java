package modulo4.forme_geometriche;

public class Main {

    public static void main(String[] args) {

        Quadrato quadrato = new Quadrato(5);
        System.out.println(quadrato.perimetro());
        quadrato.stampaQuadrato();
        System.out.println(quadrato.getColore());
        quadrato.setColore(Colore.BIANCO);
        System.out.println(quadrato.getColore());


        /*
        Cerchio cerchio = new Cerchio(5);
        System.out.println(cerchio.circonferenza());
        System.out.println(cerchio.area());
         */

    }
}
