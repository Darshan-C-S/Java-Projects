package leetCodeAndHackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsInaString {

    public static String reverseWords(String s) {
        List<String> ar = Arrays.asList(s.split("\\s+"));
        Collections.reverse(ar);
        return String.join(" ",ar).strip();
    }
    public static void main(String[] args) {

        String s = "a good   example";
        System.out.println(reverseWords(s));

    }
}
