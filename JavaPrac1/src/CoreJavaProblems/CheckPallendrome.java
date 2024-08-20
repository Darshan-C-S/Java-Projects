package CoreJavaProblems;

import java.util.Scanner;

public class CheckPallendrome {
    public static boolean checkPall ( String s){
        StringBuffer bf=  new StringBuffer(s);

        String rev =bf.reverse().toString();

        if(rev .equals(s) ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the sting : ");
        String st = in.next();
        boolean a = checkPall(st);
        if(a == true){
            System.out.println("The given string is Palindrome");
        }else {
            System.out.println("The given string is not Palindrome");
        }

    }
}
