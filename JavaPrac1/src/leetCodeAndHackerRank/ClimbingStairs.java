package leetCodeAndHackerRank;

public class ClimbingStairs {

    /*This algorithm is used to check the no of possible ways to climb the starers */
    public static int climbStair(int n){
        if(n<=3){
            return n;
        }
        int a = 0 , b = 1 , c= 0;

        for (int i = 1; i <= n; i++) {
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }


    public static void main(String[] args) {

        System.out.println(climbStair(4));

    }
}
