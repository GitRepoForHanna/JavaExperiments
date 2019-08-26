package patterns.strategy;

public class MobileMoneyPayment implements PaymentStrategy {
    @Override
    public void doPayment() {
        System.out.println("Mobile money payment is done");
    }
}
