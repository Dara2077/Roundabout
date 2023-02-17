public class Player {
    private int currentPosition;
    private int rollToGet;
    private static boolean p1Turn = true;

    public Player(){
        currentPosition = 0;
        rollToGet = 5;
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

    public boolean isP1Turn() {
        return p1Turn;
    }
}
