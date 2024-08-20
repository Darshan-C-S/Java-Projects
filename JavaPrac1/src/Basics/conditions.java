package Basics;

public class conditions {
    public static void main(String[] args) {
        int a = 13;

        if (a < 10) System.out.println("Hello");

        if (a < 15) System.out.println("World");

        if (a < 20) System.out.println("HoHO");


//        Note the switch case statements are not used to for range of values

//        in java 17 we can use lambda expressionsbye
        String greads = "A";
        switch (greads){
            case "D" -> System.out.println("Just passed");
            case "C" -> System.out.println("Passed");
            case "B" -> System.out.println("Passed with Distinction");
            case "A" -> System.out.println("Crazy");
            default -> System.out.println("not present ");

        }
        int num=20;
        switch(num){
            case 5 :  System.out.println("It is 5");
                break;
            case 10 : System.out.println("It is 10");
                break;
            case 15 : System.out.println("It is 15");
                break;
            case 20 : System.out.println("It is 20");
                break;
            default:  System.out.println("Not present");


        }
    }}