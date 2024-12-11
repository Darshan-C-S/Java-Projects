package leetCodeAndHackerRank;

import java.util.Arrays;
import java.util.List;

public class IsSubsequence {


    public static boolean isSubsequence(String s, String t) {
        int i = 0 ;
        int j = 0;

        while (i < t.length() && j< s.length()){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
            i++;
        }
        return j == s.length();
    }
    public static void main(String[] args) {


        String s = "abc", t = "ahbgdc";

        System.out.println(isSubsequence(s,t));

    }
}
