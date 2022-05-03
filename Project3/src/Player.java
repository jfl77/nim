import java.util.ArrayList;

public interface Player{
    int pickRow(ArrayList<Integer> stones);
    int takeStones(int row, ArrayList<Integer> stones);
}
//This interface is implemente universally for every type of player.
// This makes the code in the "Main" class simpler to read an implement,
// given that it can be used for every type of player, rather than writing code that is player-specific.