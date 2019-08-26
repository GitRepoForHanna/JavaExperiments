package patterns.strategy;

public class InternetMoneyPayment implements PaymentStrategy {
    @Override
    public void doPayment() {
        System.out.println("Internet money payment is done");
    }
}
