public class Move {
    private int roll1;
    private int roll2;
    private boolean isMoving;

    public Move(Player player1, Player player2) {
        roll1 = (int) (Math.random() * 6);
        roll2 = (int) (Math.random() * 6);
        if ((roll1 + roll2 == player1.getRollToGet()) || (roll1 == player1.getRollToGet()) || (roll2 == player1.getRollToGet())) {
            if (player1.getRollToGet() == 12) {
                Player.setWin();
            } else if (player1.isFirstMove()) {
                Board.changeBoard(0, player1.getName(), player1, player2);
                player1.setRollToGet(2);
                player1.setFirstMove(false);
            } else {
                Board.changeBoard(player1.getRollToGet() - 1, player1.getName(), player1, player2);
                player1.setRollToGet(player1.getRollToGet() + 1);
            }
        }
        else{
            System.out.println("You did not get your desired roll!");
        }

    }

}
