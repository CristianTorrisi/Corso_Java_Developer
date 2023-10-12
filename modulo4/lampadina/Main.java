package modulo4.lampadina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         Lampadina lampadina = new Lampadina(5);
        //Simulazione funzioanmento lampadina fino alla rottura
        System.out.println(lampadina.getStato());
        lampadina.click();
        System.out.println(lampadina.getStato());
        lampadina.click();
        System.out.println(lampadina.getStato());
        lampadina.click();
        System.out.println(lampadina.getStato());
        lampadina.click();
        System.out.println(lampadina.getStato());
        lampadina.click();
        System.out.println(lampadina.getStato());
         */

       // test();
        Lampadina lampadina = new Lampadina(10);
        Lampadina lampadina2 = new Lampadina(5);
        Lampadina lampadina3 = new Lampadina(5);
        Lampadina[] lampadine = {lampadina, lampadina2, lampadina3};
        Impianto impianto = new Impianto(true, lampadine);
        lampadina.click();
        System.out.println(lampadina.printStato());
        impianto.setElettricity(false);
        System.out.println(lampadina.printStato());
        lampadina.click();
        System.out.println(lampadina.printStato());

    }

    public static void test(){
        Scanner scanner = new Scanner(System.in);
        Lampadina lampadina = new Lampadina(5);
        Interruttore int1 = new Interruttore(lampadina);
        Interruttore int2 = new Interruttore(lampadina);
        while (true){
            System.out.println("Scegli un interuttore con 1 o 2, 0 per terminare");
            int choice = scanner.nextInt();

            if (choice == 1){
                int1.click();
                System.out.println(lampadina.printStato());
            }
            else if (choice == 2){
                int2.click();
                System.out.println(lampadina.printStato());
            }
            else if (choice == 0){
                System.out.println("Grazie");
                break;
            }
            else {
                System.out.println("Errore in scelta");
            }

        }
    }
}
