package leetCodeAndHackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfVowelsInaSubstring {

    public  static  boolean isVovel(char c){
        return c == 'a'|| c == 'e'||c == 'i'||c == 'o'||c == 'u'||c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U';
    }

    public static int maxVowels(String s, int k) {
//        int max = 0;
//        int count  = 0;
//        Set<Character> se = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
//
//        for (int i = 0; i < s.length(); i+=k) {
//            String sub = s.substring(i, Math.min(i+k , s.length()));
//            for (int j = 0; j < sub.length(); j++) {
//                if(se.contains(sub.charAt(j))){
//                    count++;
//                }
//
//            }
//            max = Math.max(max , count);
//            count = 0;
//
//        }
//        return max;

        int cnt =0 , max = 0;

        for (int i = 0; i < s.length(); i++) {
            if(isVovel(s.charAt(i))) cnt++;
            if (i >= k && isVovel(s.charAt(i-k))) cnt--;

            max = Math.max(max, cnt);

        }
        return max;


    }


    public static void main(String[] args) {

       String s  ="weallloveyou";
        System.out.println(maxVowels(s , 7));


    }
}
