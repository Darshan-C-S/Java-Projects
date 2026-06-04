package DSAPatterns.Numbers;

public class closestNumber {
    public static int closestNo(int n , int m){
// use the quotient to create n1 and n2 to get the nearest value with the least difference
        int q = n/m;
//  1st possible closest number
        int n1 = m*q;

//  2nd possible closest number
        int n2 = (m*n)>0 ? m*(q+1):m*(q-1);

        if(Math.abs(n-n1)<Math.abs(n-n2)){
            return n1;
        }
        return n2;

    }

    public static void main(String[] args) {

        int m = 4 ,n = 13 ;
        System.out.println(closestNo(n, m));

    }
}
