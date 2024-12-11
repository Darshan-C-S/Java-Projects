package DesignPattren.StrategyPattern;

// Client code
public class StrategyExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-9012-3456"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalStrategy("user@example.com"));
        cart.checkout(200);

        cart.setPaymentStrategy(new UPIStrategy("dcs10@ybl"));
        cart.checkout(1000);

    }
}
