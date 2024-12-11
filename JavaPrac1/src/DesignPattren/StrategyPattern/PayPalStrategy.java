package DesignPattren.StrategyPattern;

// Concrete Strategy for PayPal
public class PayPalStrategy implements PaymentStrategy {
    private String emailId;

    public PayPalStrategy(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
