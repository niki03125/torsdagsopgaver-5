public class Room {

    private int numberOfLamps;
    private int numberOfWindows;

    public Room (int numberOfLamps, int numberOfWindows){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfLamps(){
        return numberOfLamps;
    }

    public int getNumberOfWindows(){
        return numberOfWindows;
    }

    public void setNumberOfLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }


    public void setNumberOfWindows(int numberOfWindows){
        this.numberOfWindows = numberOfWindows;
    }
}
