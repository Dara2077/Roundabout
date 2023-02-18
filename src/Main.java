public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to RoundAbout!");
        Player p1 = new Player("R");
        Player p2 = new Player("B");
        while (!Player.hasWon()){
            System.out.println(Board.getBoard());
            if (Player.isP1Turn()){
                Move m1 = new Move(p1, p2);
            }
            else{
                Move m2 = new Move(p2, p1);
            }
            Player.setP1Turn();
        }
    }
}
