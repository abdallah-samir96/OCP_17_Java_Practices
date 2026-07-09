package patterns.behavioural.startegy;

public class EasyPay implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println(EasyPay.class.getName());
    }
}
