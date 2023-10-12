package modulo4.contatore;

public class MainTest {

    public static void main(String[] args) {
        Contatore count = new Contatore(10);
        System.out.println(count.getCount());
        count.setToZero();
        System.out.println(count.getCount());
        count.setCount(15);
        System.out.println(count.getCount());
        count.increment();
        System.out.println(count.getCount());






    }


}
