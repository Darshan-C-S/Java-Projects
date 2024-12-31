package leetCodeAndHackerRank;

import java.util.Arrays;
import java.util.Locale;

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
       StringBuilder sb  = new StringBuilder();
       Arrays.sort(strs);

       String first  = strs[0];
       String last  = strs[strs.length-1];

        for (int i = 0; i < Math.min(first.length() , last.length()); i++) {
            if(first.toLowerCase().charAt(i) != last.toLowerCase().charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();


    }
    public static void main(String[] args) {

        String [ ]ans = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(ans));
//        Arrays.sort(ans);
//        Arrays.stream(ans).forEach(System.out::println);
    }
}
