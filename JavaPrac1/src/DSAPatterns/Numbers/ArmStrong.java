package DSAPatterns.Numbers;

public class ArmStrong {
    /*
    * 153 is an Armstrong number, 1*1*1 + 5*5*5 + 3*3*3 = 153
    * */

    public static boolean ArmstrongFind(int n ){
        String no = Integer.toString(n);

        char [] ch = no.toCharArray();
        int out =0;

        for(char c : ch){
            out += (int) Math.pow(c-'0',ch.length);
        }
        return n==out;
    }

    public static void main(String[] args) {

        System.out.println("No 153 is armstrong no : "+ArmstrongFind(153));
        System.out.println("No 123 is armstrong no : "+ArmstrongFind(123));
    }
}
