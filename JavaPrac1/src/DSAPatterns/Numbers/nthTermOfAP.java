package DSAPatterns.Numbers;

public class nthTermOfAP {
    //Arithmetic Series problem

    public static int nthTermOfAP1(int a , int b , int n){

        return (a + (n-1)*(b-a));

    }
    public static void main(String[] args) {

        System.out.println("The 5th term of 1 , 4 is :  "+nthTermOfAP1(1,4,5));

    }
}
