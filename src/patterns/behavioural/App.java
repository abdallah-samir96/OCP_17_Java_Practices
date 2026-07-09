package patterns.behavioural;

import patterns.behavioural.startegy.CreditCard;
import patterns.behavioural.startegy.PaymentStrategy;

public class App {
    static void main() {

        strategy();

    }
    static void strategy() {
        var payment = new CreditCard();
        var strategy = new PaymentStrategy(payment);
        strategy.pay(1000);
        System.out.println(strategy.getInfo());
    }
}
