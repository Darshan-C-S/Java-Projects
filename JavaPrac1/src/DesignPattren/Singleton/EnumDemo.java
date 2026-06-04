package DesignPattren.Singleton;


public class EnumDemo {
    public static void main(String[] args) {
       DemoEnum en = DemoEnum.INSTANCE;
       en.setValue(10);
        System.out.println(en.getValue());

    }
}
