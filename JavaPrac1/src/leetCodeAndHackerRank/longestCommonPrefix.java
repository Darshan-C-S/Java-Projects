package leetCodeAndHackerRank;

import java.util.Arrays;

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);

        String first  =  strs[0];
        String last = strs[strs.length -1];

        for (int i = 0; i < Math.min(first.length() , last.length()); i++) {

            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();


    }
    public static void main(String[] args) {

        String [ ]ans = {"flower","Flow","flight"};

        System.out.println(longestCommonPrefix(ans));
        Arrays.sort(ans);
        Arrays.stream(ans).forEach(System.out::println);
    }
}
