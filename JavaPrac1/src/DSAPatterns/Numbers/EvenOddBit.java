package DSAPatterns.Numbers;

//Use binary operators for faster operations

public class EvenOddBit {

    public static boolean isEven(int a){
        if((a&1) == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("The no is even : "+isEven(10));
    }
}
