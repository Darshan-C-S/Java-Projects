package DesignPattren.Singleton;


public class EnumDemo {
    public static void main(String[] args) {
       DemoEnum inst = DemoEnum.INSTANCE;
       inst.setValue(44);
       System.out.println(inst.getValue());




    }
}
