package CoreJavaProblems;

import java.util.Scanner;

public class BUZZNo {
    /*Here the output will give a buzz when we have no ending with buzz no or no divisible by buzz no*/
    public static void buzzCheck(int n,int buzzno){
        if(n%10 == buzzno || n%buzzno == 0){
            System.out.println("Buzz");
        } else System.out.println(n);
    }

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        System.out.println("Enter The range : ");
        int no = in.nextInt();
        System.out.println("Enter the no to be buzzed : ");
        int buzz = in.nextInt();
        System.out.println("The seres are : ");
        for (int i = 0; i <= no; i++) {
            buzzCheck(i,buzz);
        }

    }
}
