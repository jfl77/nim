import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private Scanner sc;

    public HumanPlayer (Scanner s){
        sc = s;
    }

    public int pickRow(ArrayList<Integer> stones){
        return sc.nextInt();
    }

    public int takeStones(int row, ArrayList<Integer> stones){
        return sc.nextInt();
    }
}
