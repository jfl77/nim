import java.util.ArrayList;

public class SmartPlayer implements Player{
    public int pickRow(ArrayList<Integer> stones){
        for (int i = 0; i < stones.size(); i++){
            if (stones.get(i) > 0){
                return i;
            }
        }
        return -1;
    }

    public int takeStones(int row, ArrayList<Integer> stones){
        for (int i = 0; i < stones.size(); i++){
            if (stones.get(i) > 0){
                return stones.get(i);
            }
        }
        return -1;
    }
}
//The strategy of the SmartPlayer class is to start by finding the first row that has any pieces left.
// Then, it proceeds to take all the pieces left in that row. Therefore, if there is a single non-empty
// row left, SmartPlayer will win the game.