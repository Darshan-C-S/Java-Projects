package leetCodeAndHackerRank;

import java.util.Scanner;

public class HA_StaticInitialization {
    static int  h ,b;
    static boolean flag = false;

/* Here  we are filtering the +ve values in the static block itself so it can be used in the main method */

    static {
        Scanner in  =  new Scanner(System.in);
        h = in.nextInt();
        b = in.nextInt();

        if(h>0 && b>0){
            flag = true;
        }else {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        }


    public static void main(String[] args) throws Exception {

        if(flag){
            int ar = h*b;
            System.out.println(ar);
        }


/*Solution without static block */
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Breadth and Height : ");
//        int high = in.nextInt();
//        int breadth = in.nextInt();
//            if(high>0 && breadth >0){
//                int ar = high* breadth;
//                System.out.println(ar);
//            }
//            else {
//                throw new Exception("Breadth and height must be positive");
//            }
//
//    }
    }
}
