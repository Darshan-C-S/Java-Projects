package leetCodeAndHackerRank;

public class ReverseInteger {

    public static int reverse(int x) {
        int res = 0;
        boolean nege = x<0;

        String s = String.valueOf(Math.abs(x));

        StringBuffer sb = new StringBuffer(s).reverse();

        try {
            res = Integer.valueOf(sb.toString()).intValue();
        }catch (NumberFormatException e){
            return 0;
        }

        return nege ? -res : res;


    }
    public static void main(String[] args) {

        int a = 1534236469;
        System.out.println(reverse(a));

    }

}
