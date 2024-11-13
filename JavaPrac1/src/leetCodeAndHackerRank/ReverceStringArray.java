package leetCodeAndHackerRank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReverceStringArray {

    public static void reverseString(char[] s) {

        int i = 0;
        int j = s.length-1;

        while (i<j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;j--;
        }
        System.out.println(s);

    }
    public static  void revstring1(char[] s){
        Stack<char[]> chs = new Stack<>();
        chs.add(s);

        for (int i = 0; i < chs.size(); i++) {
            System.out.println(chs.pop());
        }
    }
    public static void main(String[] args) {

        char [] ch  = {'h','e','l','l','o'};
        reverseString(ch);

        revstring1(ch);
    }
}
