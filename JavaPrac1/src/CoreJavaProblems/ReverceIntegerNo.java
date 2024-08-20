package CoreJavaProblems;

public class ReverceIntegerNo {
    public static int revNoInt(int n){
//        By using the mod method
        int rev = 0;
        while (n!=0){
            int last = n%10;
            rev = rev*10 + last;
            n /= 10;
        }
        return rev;
    }

    public static int revNoToStr(int n){
/* For Type conversion use methods of primitive data types just like below where we convert with methods of
 wrapper classes where int value to string by String.valueOf() and String to int by Integer.valueOf() */
        String st= String.valueOf(n);
        StringBuilder stb =  new StringBuilder(st);
        int revno = Integer.valueOf(stb.reverse().toString());
        return revno;

    }

    public static void main(String[] args) {
        System.out.println("By using String reverse : "+revNoToStr(9012));
        System.out.println("By using integer Modular : "+revNoInt(342));
    }
}
