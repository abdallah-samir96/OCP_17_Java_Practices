package patterns.behavioural.startegy;

public class PaymentStrategy {
    private final PaymentMethod payment;

    public PaymentStrategy(PaymentMethod method) {
        this.payment = method;
    }
    public void pay(double amount) {
        System.out.println("Trying to pay");
        payment.pay(amount);
    }

    public String getInfo() {
        return payment.getClass().getName();
    }

}
