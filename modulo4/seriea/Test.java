package modulo4.seriea;

public class Test {
    public static void main(String[] args) {

        Giocatore player1 = new Giocatore("Leo","Messi");
        Giocatore player2 = new Giocatore("Cristiano","Ronaldo");
        Giocatore player3 = new Giocatore("Luis","Suarez");
        Giocatore player4 = new Giocatore("Lautaro","Martinez");
        Giocatore player5 = new Giocatore("Marcus","Thuram");
        Giocatore player6 = new Giocatore("Francesco","Acerbi");

        Giocatore[] rosa1 = {player1,player2};

        Squadra team1 = new Squadra("Inter",rosa1,0,0,0);
        Squadra team2 = new Squadra("Milan");
        Squadra team3 = new Squadra("Napoli");

        team2.addPlayer(player3);
        team2.addPlayer(player4);
        team3.addPlayer(player5);
        team3.addPlayer(player6);

        team1.printRosa();
        System.out.println();
        team2.printRosa();
        System.out.println();
        team3.printRosa();
        System.out.println();
        System.out.println("---------------------");

        team1.removePlayer(player1);
        team1.printRosa();
        System.out.println("---------------------");

        Squadra[] campionato = {team1,team2,team3};









    }
}
