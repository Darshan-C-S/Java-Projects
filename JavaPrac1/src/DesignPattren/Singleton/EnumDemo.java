package DesignPattren.Singleton;


public class EnumDemo {
    public static void main(String[] args) {
        DemoEnum singltonEnum = DemoEnum.INSTANCE;
        System.out.println(singltonEnum.getNum());
        singltonEnum.setNum(20);
        System.out.println(singltonEnum.getNum());

    }
}
