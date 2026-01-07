package DSAPatterns.Numbers;

public class sumOfSquares {
    public static int sumOfsq(int n){

        int sq = (n*(n+1)/2) * (2*n+1)/3;
        return sq;

    }

    public static int findSum(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {

        System.out.println("Sum of Squares of No is : "+ sumOfsq(10)+ " and sum is : "+findSum(10));
    }
}
