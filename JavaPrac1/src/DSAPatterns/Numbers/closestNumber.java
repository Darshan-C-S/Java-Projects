package DSAPatterns.Numbers;

public class closestNumber {
    public static int closestNo(int n , int m){

        int p = n/m;
        int n1 = m*p;

        int n2 = (m*n)>0 ? m*(p+1):m*(p-1);

        if(Math.abs(n-n1)<Math.abs(n-n2)){
            return n1;
        }
        return n2;

    }

    public static void main(String[] args) {

        int m = -9 ,n = 13 ;
        System.out.println(closestNo(n, m));

    }
}
