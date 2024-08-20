package DesignPattren.FactoryDesignPattren;

public class BackendDev implements Employee{
    @Override
    public int Salary() {
        System.out.println("Salary of backend dev is :");
        return 3000000;
    }
}
