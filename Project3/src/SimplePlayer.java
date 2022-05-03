import java.util.ArrayList;

public class SimplePlayer implements Player{
    public int pickRow(ArrayList<Integer> stones){
        for (int i = 0; i < stones.size(); i++){
            if (stones.get(i) > 0){
                return i;
            }
        }
        return -1;
    }

    public int takeStones(int row, ArrayList<Integer> stones){
        return 1;
    }
}