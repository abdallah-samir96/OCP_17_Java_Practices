package patterns.behavioural.command.good.fan;

public class Fan {
    public int numberOfBlade;

    public Fan() {
        this.numberOfBlade  =2;
    }
    public void turnOn(){
        System.out.println("Start the fan");
    }
    public void turnOff(){
        System.out.println("Stop the fan");
    }
}
