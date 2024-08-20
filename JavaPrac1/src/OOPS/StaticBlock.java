package OOPS;

public class StaticBlock {
    public static int a = 10;
    public static int b;

    static {
        System.out.println("Printing static block");

        b= a*10;
    }

    public static void main(String[] args) {


        System.out.println("A is : "+a);
        System.out.println("B is : "+ b);

    }
}
