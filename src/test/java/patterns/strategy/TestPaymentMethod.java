package patterns.strategy;

import org.testng.annotations.Test;

public class TestPaymentMethod {

    @Test
    public void doVisaPayment() {
        PaymentContext paymentContext = new PaymentContext(new VisaPayment());
        paymentContext.pay();
    }

    @Test
    public void doMobileMoneyPayment() {
        PaymentContext paymentContext = new PaymentContext(new MobileMoneyPayment());
        paymentContext.pay();
    }

    @Test
    public void doInternetMoneyPayment() {
        PaymentContext paymentContext = new PaymentContext(new InternetMoneyPayment());
        paymentContext.pay();
    }
}
