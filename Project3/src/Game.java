import java.util.ArrayList;

public class Game{
    ArrayList<Integer> stones = new ArrayList <>();
    private Player p1;
    private Player p2;
    private int randNum;

    public Game(Player one, Player two, int r){
        p1 = one;
        p2 = two;
        randNum = r;
        for (int i = 0; i <randNum; i++){
            stones.add(i+3);
        }
    }

    public void play(){
        Player current = p1;
        int currentPlayer = 0;
        System.out.println();
        while(!gameOver(stones)){
            System.out.println(stones);
            //outputs current player with each move
            if(current == p1){
                currentPlayer = 1;
            } else if(current == p2){
                currentPlayer = 2;
            }
            System.out.println("Player " + currentPlayer + " pick your row: ");
            int rowOne = current.pickRow(stones);
            System.out.println("Player " + currentPlayer + " select a number of stones to remove from row: ");

            int stonesOut = current.takeStones(rowOne, stones);

            stones.set(rowOne, (stones.get(rowOne)-stonesOut));
            //swaps players after every turn
            if (current == p1){
                current = p2;
            } else {
                current = p1;
            }
        }
        if (current == p1){
            System.out.println("Player 2 wins!");
        } else if (current == p2){
            System.out.println("Player 1 wins!");
        }
    }

    public boolean gameOver(ArrayList<Integer> stones){
        for (int stone:stones){
            if (stone != 0){
                return false;
            }
        }
        return true;
    }
}