import java.lang.reflect.Array;
import java.util.*;

public class Board {
    private static ArrayList<String> board = new ArrayList(Arrays.asList("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"));

    public static void changeBoard(int index, String piece, Player player1, Player player2){
        if (player1.isFirstMove()){
            board.set(index, piece);
            player1.setCurrentPosition(index);
            if (player1.getCurrentPosition() == player2.getCurrentPosition()){
                player2.setCurrentPosition(0);
                player2.setFirstMove(true);
            }
        }
        else{
            board.set(index, piece);
            board.set(index - 1, "-");
            player1.setCurrentPosition(index);
            if (player1.getCurrentPosition() == player2.getCurrentPosition()){
                player2.setCurrentPosition(0);
                player2.setFirstMove(true);
            }
        }
    }

    public static ArrayList<String> getBoard(){
        return board;
    }
}
