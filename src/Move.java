public class Move {
    private int roll1;
    private int roll2;
    private boolean isMoving;

    public Move(Player player){
        roll1 = (int)(Math.random() * 6);
        roll2 = (int)(Math.random() * 6);
        if ((roll1 + roll2 == player.getRollToGet()) || (roll1 == player.getRollToGet()) || (roll2 == player.getRollToGet())){

        }
    }



}
