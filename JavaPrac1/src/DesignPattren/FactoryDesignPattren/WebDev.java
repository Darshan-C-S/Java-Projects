package DesignPattren.FactoryDesignPattren;

public class WebDev implements Employee{

    @Override
    public int Salary() {
        System.out.println("Salary of web dev : ");
        return 2000000;
    }
}
