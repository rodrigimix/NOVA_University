public class TrafficLight {
    private boolean green, yellow, red;
    public TrafficLight(){
        green = false;
        yellow = false;
        red = true;
    }
    public boolean isRed(){
        return red;
    }
    public boolean isGreen(){
        return green;
    }
    public boolean isYellow(){
        return yellow;
    }
    public boolean mustStop(){
        return red;
    }
    public boolean canGo(){
        if (!red){
            return true;
        }
        else{
            return false;
        }
    }
    public void changeColor(){
        if (green){
            green = false;
            yellow = true;
        }
        else if(yellow){
            yellow = false;
            red = true;
        }
        else {
            red = false;
            green = true;
        }
    }
}
