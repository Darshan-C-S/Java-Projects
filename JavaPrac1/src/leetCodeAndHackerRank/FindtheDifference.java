package leetCodeAndHackerRank;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindtheDifference {
    public static char findTheDifference(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        for (i = 0; i <t.length() ; i++) {
            for (int j = 0; j < sb.length(); j++) {
                if(sb.charAt(j) == t.charAt(i)){
                    sb.deleteCharAt(j);
                    break;
                }
                if(j == sb.length()-1){
                    return t.charAt(i);
                }
            }
        }
        return t.charAt(i-1);
    }

    public static void main(String[] args) {

        String s  = "abcd";
        String i = "abcsd";
        System.out.println(findTheDifference(s,i));

    }
}
