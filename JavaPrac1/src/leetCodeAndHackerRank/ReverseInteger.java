package leetCodeAndHackerRank;

public class ReverseInteger {

    public static int reverse(int x) {

        String s = Integer.toString(x);
        boolean nege = x<0;
        StringBuilder sb = new StringBuilder(s);

        String rev = sb.reverse().toString();
        int ans = Integer.valueOf(rev).intValue();

        if (nege == true) {
            return -ans;
        }
        return ans;



    }
    public static void main(String[] args) {

        int a = -123;
        System.out.println(reverse(a));

    }

}
