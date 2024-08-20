package Collections;

import java.util.Arrays;
import java.util.Scanner;

public class StrinToCharArrayAndDeletAfterSomeTime {
    public static void main(String[] args) {
/*    The Main purpous of this code is to replicate the string deletion or replication
with 0 after some time of not using it with sleep of 2 sec delay for the replication

Here we are mimicking garbage collector which collects the un used string object  */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String to add in the memory : ");
        String s = in.next();
        char [] ch = s.toCharArray();

        System.out.println("Enter The desired Delay in seconds : ");
        int delay = 1000*in.nextInt();
        System.out.println("The char array before the time : "+new String(ch));

        new Thread(()-> {
            try{
            Thread.sleep(delay);
            Arrays.fill(ch , '0');
            System.out.println("The char array after the time : "+new String(ch));

        } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("The thread is interrupted due to : "+ e);;
            }
        }).start();

//        new Thread(()->{
//            {
//                try {
//                    Thread.sleep(2000);
//                    System.out.println("Printing 2sec later ");
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//
//            }}).start();


//        String h = "Hello World";
//        String rep = h.replace("World", "Darshan");
//        System.out.println(rep);
////        compareTo is to compare the string lexographily which gives output
//        String ar = "Hello World";
//        int a = ar.compareTo(h);
//        System.out.println(a);

}}
