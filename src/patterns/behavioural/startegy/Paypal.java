package patterns.behavioural.startegy;

public class Paypal implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println(Paypal.class.getName());
    }
}