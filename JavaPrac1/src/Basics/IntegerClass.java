package Basics;

public class IntegerClass {
    public static void main(String[] args) {
        Integer ic = Integer.valueOf(8);
        int iv = ic.intValue();
        Integer is = Integer.valueOf("8866");

        System.out.println("Integer Class value : "+ ic + " Integer Primitive value : "+ iv + " Integer value of string : "+ is);

        System.out.println("The compared to gives 1 if the original value is bigger , 0 for equal , -1 for smaller " +
                ", the value is :  "+is.compareTo(is));
        System.out.println("The Boolean comparison uses equals : "+ is.equals(is));

        System.out.println("The max Integer Value is : "+Integer.MAX_VALUE+ " and Min value is : "+Integer.MIN_VALUE);

        int reverced = Integer.reverse(46);
        System.out.println("The Binary reverse of integer 46 is : "+reverced);

        int a = 11;
        System.out.println("Int to Float by explicit conversion  : "+(float) a );
        int binrev = Integer.bitCount(a);
        String binString = Integer.toBinaryString(a);
        System.out.println("BitCount of : " + a +" is : "+binrev+" and binary string is : "+ binString);



        Integer a1 = Integer.valueOf("124");
        Integer b = Integer.parseInt("123");
        int intVal = b.intValue();
        System.out.println(a1 == b);
        System.out.println(a1.compareTo(b));





    }
}
