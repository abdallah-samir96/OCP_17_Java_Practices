package patterns.behavioural.startegy;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        // integrating with banking, making the checkout
        System.out.println("Credit Card Payment");

    }
}