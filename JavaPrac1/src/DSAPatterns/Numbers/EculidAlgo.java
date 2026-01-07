package DSAPatterns.Numbers;

public class EculidAlgo {
    public static int findGcd(int a , int b){
        if(a == 0){
            return b;
        }
        return findGcd(b%a , a);
    }

    public static void main(String[] args) {

        System.out.println("The GCD of two no is : "+findGcd(35,10));
    }
}
