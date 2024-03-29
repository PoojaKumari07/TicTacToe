import board.Board;
import game1.Game1;
import player.Player;
//import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hello World");

        Board b = new Board(3, '@');

        // b.printBoardConfig();
        // System.out.println("enter the name of player1: ");
        // Scanner scn = new Scanner(System.in);

        // String name = scn.nextLine();
        // System.out.println("enter the symbol of player1: ");
        // char symbol = scn.nextLine().charAt(0);

        Player p1 = new Player();
        p1.setPlayerNameAndSymbol("pooja", 'X');
        p1.getPlayerNameAndSymbol();

        Player p2 = new Player();
        p2.setPlayerNameAndSymbol("abhi", 'O');
        p2.getPlayerNameAndSymbol();

        Game1 game1 = new Game1(new Player[] { p1, p2 }, b);
        game1.play();

    }
}
