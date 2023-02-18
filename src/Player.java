public class Player {
    private int currentPosition;
    private int rollToGet;
    private static boolean p1Turn = true;
    private boolean isFirstMove;
    private String name;
    private static boolean win = false;

    public Player(String name){
        currentPosition = 0;
        rollToGet = 5;
        isFirstMove = true;
        this.name = name;
    }

    public static boolean hasWon(){
        return win;
    }

    public static void setWin(){
        win = true;
    }

    public String getName(){
        return name;
    }

    public boolean isFirstMove(){
        return isFirstMove;
    }

    public void setCurrentPosition(int newPosition){
        currentPosition = newPosition;
    }

    public void setRollToGet(int newRollToGet){
        rollToGet = newRollToGet;
    }

    public int getRollToGet(){
        return rollToGet;
    }

    public static boolean isP1Turn() {
        return p1Turn;
    }

    public static void setP1Turn(){
        p1Turn = !p1Turn;
    }

    public void setFirstMove(boolean value){
        isFirstMove = value;
    }

    public int getCurrentPosition(){
        return currentPosition;
    }

}
