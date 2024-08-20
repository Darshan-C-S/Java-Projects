package CoreJavaProblems;

import java.util.Scanner;

public class ClimbingMinStairs {
/* The program is to get the least no of steps taken by the person to reach nth step if the person can climb min 1
* and max 2 steps at a time  */

    public static int countMinStps(int n){
        int count ;
        if(n%2==0){
            count = n/2;
        }else {
            count = (n/2)+1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the no of steps");
        int steps = in.nextInt();
        System.out.println("The min steps that can be taken to reach "+ steps + " steps is "+countMinStps(steps));

    }
}
