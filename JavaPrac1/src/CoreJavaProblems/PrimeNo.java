package CoreJavaProblems;

import java.sql.Array;

public class PrimeNo {
    public static void primNo (int n) {

        int flag = 0;

        if (n == 0 || n == 1) {
            flag = 0;
            System.out.println("The no is not prime : "+n);
        }
        else {
            int m = n / 2; // here m value is half of the n as its the highest value that can divide n
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    System.out.println("The no is not prime : "+n);
                    break;

                }
            }
        }
        if (flag == 0) System.out.println("The no is prime : "+n);
    }
    //        to get the range of prime no



    public static void main(String[] args) {

        int n =11;
        primNo(n);
    }
}
