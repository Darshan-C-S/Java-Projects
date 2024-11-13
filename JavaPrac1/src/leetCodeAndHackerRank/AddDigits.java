package leetCodeAndHackerRank;

public class AddDigits {
    public static int addDigitsRecurr(int num) {
        int sum=0;
        if (num == 0)
            return 0;

        while(num != 0) {
            sum+=(num%10);
            num/=10;
        }
        if(sum<10)
            return sum;
        else
            return addDigitsRecurr(sum);

    }

    public static int addDigitEasy(int n ){
        if (n == 0){
            return 0;
        }
        if(n%9 == 0){
            return 9;
        }
        else {
            return n%9;
        }
    }

    public static void main(String[] args) {

        int  n = 25;
        System.out.println("Recursive solution : "+ addDigitsRecurr(n));
        System.out.println("Mod 9 solution : "+ addDigitEasy(n));
    }
}
