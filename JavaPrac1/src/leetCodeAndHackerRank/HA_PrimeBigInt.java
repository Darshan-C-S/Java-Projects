package leetCodeAndHackerRank;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.SortedMap;

public class HA_PrimeBigInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no to check prime : ");
        BigInteger n = in.nextBigInteger();
/*BigInt is used to process large integer no with its inbuilt functions */

        if(n.isProbablePrime(1)){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
        System.out.println("Type conversion from int to bigInt : ");
        int a = 10;
        BigInteger no  = BigInteger.valueOf(a);
        System.out.println("After to bg int conversion : "+no);

        System.out.println("Type conversion from String to bigInt : ");
        String b = "123";
        BigInteger no1 = new BigInteger(b);
        System.out.println(no1);

    }
}
