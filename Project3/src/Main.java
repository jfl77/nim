import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Player selectPlayer(int pick){
        Scanner sc = new Scanner(System.in);
        Player p = null;
//Allows for player selection based on number input
        if (pick == 1){
            p = new HumanPlayer(sc);
        } else if (pick == 2){
            p = new SimplePlayer();
        } else if (pick == 3){
            p = new SmartPlayer();
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Who should be player 1? 1)Human 2)Simple PC 3)Smart PC");
        int selectP1 = sc.nextInt();
        sc.nextLine();
        Player p1 = selectPlayer(selectP1);

        System.out.println("Who should be player 2? 1)Human 2)Simple PC 3)Smart PC");
        int selectP2 = sc.nextInt();
        sc.nextLine();
        Player p2 = selectPlayer(selectP2);

        int randNum = getRandomNumber();
        Game g = new Game(p1, p2, randNum);
        g.play();
    }

    private static int getRandomNumber(){
        Random lines = new Random();
        return lines.nextInt(5)+3;
    }
}