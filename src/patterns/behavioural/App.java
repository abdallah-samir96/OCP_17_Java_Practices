package patterns.behavioural;

import patterns.behavioural.command.bad.Remote;
import patterns.behavioural.command.good.fan.Fan;
import patterns.behavioural.command.good.fan.TurnOffFanCommand;
import patterns.behavioural.command.good.fan.TurnOnFanCommand;
import patterns.behavioural.command.good.light.Light;
import patterns.behavioural.command.good.RemoteControl;
import patterns.behavioural.command.good.light.TurnOffLightCommand;
import patterns.behavioural.startegy.CreditCard;
import patterns.behavioural.startegy.PaymentStrategy;

public class App {
    static void main() {

       // strategy();
       // commandBadDesign();
        command();

    }
    static void strategy() {
        var payment = new CreditCard();
        var strategy = new PaymentStrategy(payment);
        strategy.pay(1000);
        System.out.println(strategy.getInfo());
    }
    static void command() {
        // Encapsulate a request as an object.
        // Separate the object that requests an action from the object that performs the action.

        var remote = new RemoteControl();
        var light  = new Light();
        var fan  = new Fan();
        remote.press(new TurnOffLightCommand(light));
        remote.press(new TurnOnFanCommand(fan));
        remote.press(new TurnOffFanCommand(fan));

    }
    static void commandBadDesign() {
        var remote = new Remote(new Remote.Light(), new Remote.Fan(), new Remote.TV(), new Remote.Garage());
        remote.fanButton();
        remote.garageButton();
    }
}
