package leetCodeAndHackerRank;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        char[] s1 = s.toLowerCase().toCharArray();
        char[] t1= t.toLowerCase().toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);
    }
    public static void main(String[] args) {

    }
}
