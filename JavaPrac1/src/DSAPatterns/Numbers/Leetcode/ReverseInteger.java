package DSAPatterns.Numbers.Leetcode;

public class ReverseInteger {
    public static int reverse(int x) {
        boolean isNegetive = x < 0;
        String no = Integer.toString(Math.abs(x));
        String st = new StringBuffer(no).reverse().toString();

        try {
            int res = Integer.parseInt(st);
            return isNegetive? -res: res;
        }catch (NumberFormatException e){
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(reverse(120));   // Output: 21
        System.out.println(reverse(-456));  // Output: -654
        System.out.println(reverse(0));


    }
}
