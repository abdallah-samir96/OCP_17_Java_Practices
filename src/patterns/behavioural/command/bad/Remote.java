package patterns.behavioural.command.bad;

public class Remote {

    // This is coupling as the remote knows all thing about light, fan, tv, so on
    private final Light light;
    private final Fan fan;
    private final TV tv;
    private final Garage garage;

    public Remote(Light light, Fan fan, TV tv, Garage garage) {
        this.light = light;
        this.fan = fan;
        this.tv = tv;
        this.garage = garage;
    }

    public void lightButton() {
        light.turnOn();
    }

    public void fanButton() {
        fan.start();
    }

    public void tvButton() {
        tv.powerOn();
    }

    public void garageButton() {
        garage.open();
    }
    public static class Light{
        void turnOn(){
            System.out.println("Turn on");
        }
    }
    public static class TV{
        void powerOn(){
            System.out.println("Power on");
        }
    }

    public static class Fan{
        void start(){
            System.out.println("start");
        }
    }

    public static class Garage{
        void open(){
            System.out.println("Open");
        }
    }
}