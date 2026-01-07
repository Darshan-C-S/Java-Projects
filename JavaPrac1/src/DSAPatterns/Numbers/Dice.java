package DSAPatterns.Numbers;

public class Dice {
    public static int oppositeFacingNo(int n){
        return 7-n;
    }

    public static void main(String[] args) {
        System.out.println("The opposite facing of 6 is : "+ oppositeFacingNo(6));
    }
}
