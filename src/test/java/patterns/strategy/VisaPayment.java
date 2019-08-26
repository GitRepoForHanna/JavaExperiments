package patterns.strategy;

public class VisaPayment implements PaymentStrategy {
    @Override
    public void doPayment() {
        System.out.println("Visa payment is done");
    }
}
