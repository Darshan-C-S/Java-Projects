package DesignPattren.StrategyPattern;

public class UPIStrategy implements PaymentStrategy{

    String UPIId;

    UPIStrategy(String UPIId){
        this.UPIId = UPIId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("The amount : "+ amount + " Is payed by UPI of Id :"+UPIId);
    }
}
